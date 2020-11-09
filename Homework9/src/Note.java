import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Note {

    public final ArrayList<String> notes = new ArrayList<String>();
    private final static ReentrantReadWriteLock LOCK = new ReentrantReadWriteLock();

    public void addNote(int index, String note) {

            LOCK.writeLock().lock();
            System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
            notes.add(index, note);
            System.out.println("Уже добавлена заметка [" + note + "]");
            LOCK.writeLock().unlock();
        }

        public synchronized void removeNote(int index) {
            LOCK.readLock().lock();
            System.out.println("Сейчас будет удалена заметка с позиции " + index);
            String note;
            note = notes.remove(index);
            System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
            LOCK.readLock().unlock();
        }

        public void readNote(int index) {
            LOCK.writeLock().lock();
            System.out.println("Сейчас будет прочтена заметка с позиции " + index);
            String note;
            note = notes.get(index);
            System.out.println("Прочтена заметка [" + note + "] с позиции " + index);
            LOCK.writeLock().unlock();
        }
    }

