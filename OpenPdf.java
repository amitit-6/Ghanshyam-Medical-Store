/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import Database.PharmacyUtils;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class OpenPdf {
    public static void openById(String id)
    {
        try
        {
            if((new File(PharmacyUtils.billPath+id+".pdf")).exists())
            {
                Process p=Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler "+PharmacyUtils.billPath+""+id+".pdf");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"File is not Exists.");
            }
        }
        catch(HeadlessException | IOException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }    
    }
}
