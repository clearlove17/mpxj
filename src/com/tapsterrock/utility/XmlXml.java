/*
 * file:       XmlXml.java
 * author:     Jon Iles
 * copyright:  (c) Tapster Rock Limited 2002-2003
 * date:       21/02/2003
 */

/*
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation; either version 2.1 of the License, or (at your
 * option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307, USA.
 */

package com.tapsterrock.utility;

import com.tapsterrock.mspdi.MSPDIFile;

/**
 * This is a trivial utility class used to provide a simple file
 * format conversion tool that can be run from the command line.
 * It takes the name of an input MSPDI XML file, and the name of an MPX file
 * to which the contents of the MSPDI file will be written.
 */
public class XmlXml
{
   /**
    * Main method.
    *
    * @param args array of command line arguments
    */
   public static void main (String[] args)
   {
      try
      {
         if (args.length != 2)
         {
            System.out.println ("Usage: XmlXml <input xml file name> <output xml file name>");
         }
         else
         {
            System.out.println ("Conversion started.");
            long start = System.currentTimeMillis();
            MSPDIFile xml = new MSPDIFile (args[0]);            
            xml.write(args[1]);
            long elapsed = System.currentTimeMillis() - start;
            System.out.println ("Conversion completed in " + elapsed + "ms.");
         }
      }

      catch (Exception ex)
      {
         ex.printStackTrace(System.out);
      }
   }
}
