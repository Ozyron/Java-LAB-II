// [CP1] การใช้ Inheritance (DailyQuest เป็นบุตรของ Quest)
public class DailyQuest extends Quest {
    public DailyQuest(String id, String title, int difficulty) {
        super(id, title, difficulty);
    }

    @Override
    public int rewardPoints(int key) {
        // [CP2] สูตรคำนวณคะแนนเฉพาะของ DailyQuest
        return (difficulty * 3 + key) % 25 + 5;
    }

    @Override
    public boolean canComplete(int energy, int logic, int luck) {
        // [CP2] เงื่อนไขการทำสำเร็จ (DailyQuest ทำได้เสมอ)
        return true;
    }
}