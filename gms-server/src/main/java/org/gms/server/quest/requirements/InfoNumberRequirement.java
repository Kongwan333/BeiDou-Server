/*
    This file is part of the HeavenMS MapleStory Server
    Copyleft (L) 2016 - 2019 RonanLana

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation version 3 as published by
    the Free Software Foundation. You may not use, modify or distribute
    this program under any other version of the GNU Affero General Public
    License.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
package org.gms.server.quest.requirements;

import org.gms.client.Character;
import org.gms.provider.Data;
import org.gms.provider.DataTool;
import org.gms.server.quest.Quest;
import org.gms.server.quest.QuestRequirementType;

/**
 * @author Ronan
 */
public class InfoNumberRequirement extends AbstractQuestRequirement {

    private short infoNumber;
    private final int questID;

    public InfoNumberRequirement(Quest quest, Data data) {
        super(QuestRequirementType.INFO_NUMBER);
        questID = quest.getId();
        processData(data);
    }

    @Override
    public void processData(Data data) {
        infoNumber = (short) DataTool.getIntConvert(data, 0);
    }


    @Override
    public boolean check(Character chr, Integer npcid) {
        return true;
    }

    public short getInfoNumber() {
        return infoNumber;
    }
}