package PrinterExample;

public class Printer {
    private int PagePrinted=1;
    private int TonerLevel=50;
    private int TonerAmount=0;
    private boolean DuplexPrinter=true;

    public Printer(int pagePrinted, int tonerLevel, boolean duplexPrinter) {
        if((this.PagePrinted)>0)
        {
            this.PagePrinted = pagePrinted;
        }
        if(this.TonerLevel>0 && this.TonerLevel<100)
        {
            this.TonerLevel = tonerLevel;
        }
        DuplexPrinter = duplexPrinter;
    }
    public int PagePrinted(int Page)
    {
        int PrintPage=Page;
        if(this.DuplexPrinter)
        {
            System.out.println("This is Duplex Mode !!");
            PagePrinted+=PrintPage;
            System.out.println("Total Page Was "+PagePrinted);
            PagePrinted/=2;
            return  PagePrinted;
        }
        PagePrinted+=PrintPage;
        return PagePrinted;
    }

    public int getPagePrinted() {
        return PagePrinted;
    }

    public int AddToner(int TonerAmt)
    {
      TonerAmount =TonerAmt;
        if((this.TonerLevel+this.TonerAmount)>100)
        {
            return -1;
        }
        else
        {
            TonerLevel+=TonerAmount;
            return TonerLevel;
        }
    }
}
