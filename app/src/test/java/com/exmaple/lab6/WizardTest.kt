package com.exmaple.lab6

import com.example.lab6.Wizard
import org.junit.Before
import org.junit.Test
import org.junit.Assert.assertEquals

class WizardTest {

    private lateinit var evilWizard: Wizard

    // Set up a new wizard before every single test
    @Before
    fun setUp() {
        evilWizard = Wizard("Evil Wizard", 30, 10)
    }

    @Test
    fun testExplosionSuccess() {
        val damage = evilWizard.castSpell("Explosion")

        assertEquals(30, damage)
        assertEquals(20, evilWizard.mana)
    }

    @Test
    fun testExplosionFailure() {
        evilWizard.mana = 5

        val damage = evilWizard.castSpell("Explosion")

        assertEquals(0, damage)
        assertEquals(5, evilWizard.mana)
    }

    @Test
    fun testFrostbiteSuccess() {
        val damage = evilWizard.castSpell("Frostbite")

        assertEquals(20, damage)
        assertEquals(25, evilWizard.mana)
    }

    @Test
    fun testFrostbiteFailure() {
        evilWizard.mana = 3

        val damage = evilWizard.castSpell("Frostbite")

        assertEquals(0, damage)
        assertEquals(3, evilWizard.mana)
    }





}