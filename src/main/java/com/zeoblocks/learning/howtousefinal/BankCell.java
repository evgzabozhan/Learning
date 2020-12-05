package com.zeoblocks.learning.howtousefinal;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Evgeniy Zabozhan (evgzabozhan@gmail.com)
 * @version $
 * @since 1.0
 */
public class BankCell {
    private final long id;
    private final String cellName;
    private final Account account;
    private double cellValue;
    private double cellCostInMonth;

    public BankCell(final long id, final String cellName, final Account account, final double cellValue, final double cellCostInMonth) {
        this.id = id;
        this.cellName = cellName;
        this.account = account;
        this.cellValue = cellValue;
        this.cellCostInMonth = cellCostInMonth;
    }

    public long getId() {
        return this.id;
    }

    public String getCellName() {
        return this.cellName;
    }

    public Account getAccount() {
        return this.account;
    }

    public double getCellValue() {
        return this.cellValue;
    }

    public double getCellCostInMonth() {
        return this.cellCostInMonth;
    }

    public void setCellValue(final double cellValue) {
        this.cellValue = cellValue;
    }

    public void setCellCostInMonth(final double cellCostInMonth) {
        this.cellCostInMonth = cellCostInMonth;
    }
}
