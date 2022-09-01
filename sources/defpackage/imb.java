package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* compiled from: PG */
/* renamed from: imb  reason: default package */
/* loaded from: classes.dex */
public class imb {
    public final Context b;
    public final ilz c;
    protected final ima d = new ima();
    protected LinearLayout e;

    public imb(Context context, ilz ilzVar) {
        this.b = context;
        this.c = ilzVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int a() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int b() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final double c() {
        double measuredWidth = ((ViewGroup) this.e.getChildAt(0)).getChildAt(this.d.f).getMeasuredWidth();
        double d = this.d.f;
        Double.isNaN(d);
        Double.isNaN(measuredWidth);
        double d2 = measuredWidth * (d + 0.5d);
        double paddingLeft = this.e.getPaddingLeft();
        Double.isNaN(paddingLeft);
        return d2 + paddingLeft;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final double d() {
        double measuredHeight = ((ViewGroup) this.e.getChildAt(0)).getChildAt(this.d.f).getMeasuredHeight();
        double d = this.d.f;
        Double.isNaN(d);
        Double.isNaN(measuredHeight);
        double d2 = measuredHeight * (d + 0.5d);
        double paddingTop = this.e.getPaddingTop();
        Double.isNaN(paddingTop);
        return d2 + paddingTop;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float e() {
        return 0.25f;
    }

    public final int f(int i, int i2) {
        ima imaVar = this.d;
        return (imaVar.d() || imaVar.c()) ? i : (i2 - 1) - i;
    }
}
