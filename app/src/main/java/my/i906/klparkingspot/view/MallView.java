package my.i906.klparkingspot.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import my.i906.klparkingspot.R;
import my.i906.klparkingspot.model.Mall;

public class MallView extends FrameLayout {

    @InjectView(R.id.tv_name)
    protected TextView mNameView;

    @InjectView(R.id.tv_lot)
    protected TextView mLotView;

    @InjectView(R.id.tv_date)
    protected ElapsedTextView mDateView;

    public MallView(Context context) {
        this(context, null, 0);
    }

    public MallView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MallView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.view_mall, this, true);
        ButterKnife.inject(this);
    }

    public void setMall(Mall mall) {
        mNameView.setText(mall.getName());
        mLotView.setText("" + mall.getLot());
        mDateView.setDate(mall.getLastRefreshed());
    }
}
