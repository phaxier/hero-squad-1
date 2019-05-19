public class Squad {
    private String mName;
    private String mCause;
    private String mMaximum;

    public Squad(String name, String cause, String maximum){
        mName = name;
        mCause = cause;
        mMaximum = maximum;
    }

    public String getName(){
        return mName;
    }

    public String getCause(){
        return mCause;
    }

    public String getMax(){
        return mMaximum;
    }
}
