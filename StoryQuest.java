// [CP1] การใช้ Inheritance และ Polymorphism
public class StoryQuest extends Quest {
    public StoryQuest(String id, String title, int difficulty) {
        super(id, title, difficulty);
    }

    @Override
    public int rewardPoints(int key) {
        // [CP2] สูตรคำนวณคะแนนเฉพาะของ StoryQuest (คะแนนมากกว่า)
        return (difficulty * 10 + key * 2) % 60 + 20;
    }

    @Override
    public boolean canComplete(int energy, int logic, int luck) {
        // [CP2] เงื่อนไขการทำสำเร็จ (ต้องผ่านเกณฑ์ Status)
        return (logic > 60) || (luck > 70) || (energy > 75);
    }
}