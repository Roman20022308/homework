public class Adapter {
    public static void main(String[] args) {
        //это пример вывода
        ATable aTable = new ATable() {
            @Override
            public String getCurrentUserName() {
                return "User";
            }

            @Override
            public String getTableName() {
                return "Table";
            }
        };

        BTable table = new TableAdapter(aTable);
        System.out.println(table.getHeaderText());
    }

    public static class TableAdapter implements BTable {
        String username,tablename;

        TableAdapter(ATable aTable)
        {
            this.tablename=aTable.getTableName();
            this.username=aTable.getCurrentUserName();

        }

        @Override
        public String getHeaderText() {
            return this.username+this.tablename;
        }
    }

    public interface ATable {
        String getCurrentUserName();
        String getTableName();
    }

    public interface BTable {
        String getHeaderText();
    }
}