import java.util.*;

public class QuestService {
    // [CP1] ใช้ ArrayList จัดการชุดข้อมูล Quest
    public ArrayList<Quest> quests = new ArrayList<>();
    
    // [CP3] ใช้ HashMap จัดการสถิติ (Key-Value)
    public HashMap<String, Integer> stats = new HashMap<>();

    public QuestService() {
        // [CP3] กำหนดค่าเริ่มต้นสถิติ
        stats.put("completed", 0);
        stats.put("failed", 0);
    }

    public void seedQuests(int key) {
        // [CP1] สร้าง 6 เควสต์แบบเฉพาะบุคคลโดยใช้ key
        quests.add(new DailyQuest("D-" + key + "-1", "Scan Lab Tools", (key % 5) + 1));
        quests.add(new DailyQuest("D-" + key + "-2", "Clean Dataset", ((key + 1) % 5) + 1));
        quests.add(new DailyQuest("D-" + key + "-3", "Refactor Code", ((key + 2) % 5) + 1));

        quests.add(new StoryQuest("S-" + key + "-1", "Decrypt Archive", ((key + 3) % 5) + 1));
        quests.add(new StoryQuest("S-" + key + "-2", "Escape the Loop", ((key + 4) % 5) + 1));
        quests.add(new StoryQuest("S-" + key + "-3", "Boss: NullPointer", ((key + 5) % 5) + 1));
    }

    public void listQuests() {
        for (Quest q : quests) {
            System.out.println(q.toString());
        }
    }

    public Quest findById(String id) {
        for (Quest q : quests) {
            if (q.getId().equalsIgnoreCase(id)) return q;
        }
        return null;
    }
}