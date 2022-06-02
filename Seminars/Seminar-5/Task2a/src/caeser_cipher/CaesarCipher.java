package caeser_cipher;

public class CaesarCipher
{
    private int shiftLength;
    private static final int CAPITAL_A_CODE = 'A';

    public CaesarCipher(int shiftLength)
    {
        setShiftLength(shiftLength);
    }

    public CaesarCipher()
    {
        this.shiftLength = 3;
    }

    public int getShiftLength()
    {
        return shiftLength;
    }

    public void setShiftLength(int shiftLength)
    {
        if (shiftLength > 0 && shiftLength <= 26)
            this.shiftLength = shiftLength;
        else this.shiftLength = 3;
    }

    public String encrypt(String plaintext)
    {
        char[] letters = plaintext.toCharArray();
        //(letterCode - capitalACode + shiftLength) % 26 + capitalACode
        for (int i = 0; i<letters.length; i++)
        {
            int letterCode = letters[i];
            letters[i] = (char) ((letterCode - CAPITAL_A_CODE + shiftLength) % 26 + CAPITAL_A_CODE);
        }

        return new String(letters);
    }

    public String decrypt(String plaintext)
    {
        char[] letters = plaintext.toCharArray();
        //(letterCode - capitalACode - shiftLength + 26) % 26 + capitalACode
        for (int i = 0; i<letters.length; i++)
        {
            int letterCode = letters[i];
            letters[i] = (char) ((letterCode - CAPITAL_A_CODE - shiftLength + 26) % 26 + CAPITAL_A_CODE);
        }
        return new String(letters);
    }

}
