/*
 * GNU GPL v3 Licence
 *
 * Copyright (C) 2017  Dalla Torre, Daniele <dallatorre.daniele@gmail.com>
 * Author: Dalla Torre, Daniele <dallatorre.daniele@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.altervista.growworkinghard.slu;

/**
 * @brief Check the definded section if safety designed  
 *
 * @author ftt01, dallatorre.daniele@gmail.com
 * @version 0.1
 * @date Jul 01, 2017
 * @copyright GNU Public Licence v3 Dalla Torre, Daniele
 *
 * This class evaluate the sigmaConcrete and sigmaSteel, than check if them values are less than sigmaRConcrete and sigmaRSteel respectively. 
 * The hypothesis that this procedure has are:
 * <ol>
 * <li>uniform deformation of all the section;</li>
 * <li>uniform tension in the concrete section;</li>
 * <li>concentrated forced applied at the steel bars;</li>
 * <li>Hooke law: &sigma; = E&sdot;&epsilon;</li>
 * </ol>
 *
 * @in normalStess
 * @in sigmaRConcrete
 * @in sigmaRSteel
 * @in areaConcrete
 * @in areaSteet
 *
 * @check sigmaConcrete vs sigmaRConcrete
 * @check sigmaSteel vs sigmaRSteel
 */
public class compressionChecking{
    double ciao;

    public static Double normalizeToOne(final Double inputValue) {

        if (inputValue < 100)
            return inputValue / 100;
        else {
            String message = "The input value cannot be convert to 1\n";
            message += "It is not a percentage.";
            throw new IllegalArgumentException(message);
        }

    }
}
