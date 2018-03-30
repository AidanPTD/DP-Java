package gameplay;

import java.util.Random;

public class Hero
{
    private static Integer currentSpellIndex = 0;
    private static String[] spells = {"Fire", "Ice", "Thunder"};
    public static void Hero() {
        currentSpellIndex = 0;
    }
    public String SwitchToNextSpell() 
    {
        currentSpellIndex += 1;
        if(currentSpellIndex > spells.length)
        {
            currentSpellIndex = 0;
        }
        return "Using the " + spells[currentSpellIndex] + " spell";
    }
    public String CastSpell() 
    {
        Random random = new Random();
        gameplay.MagicSpell.mana = random.nextInt(100);
        gameplay.MagicSpell.name = spells[currentSpellIndex];
        String message = "Casted a " + gameplay.MagicSpell.name + ": " + gameplay.MagicSpell.mana + " mana remaining " + gameplay.MagicSpell.damage + " damage done";
        return message;
    }
    public void Destroy() {
        currentSpellIndex = 0;
    }
}