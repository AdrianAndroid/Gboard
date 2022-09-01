package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    private boolean K;
    private final SeekBar.OnSeekBarChangeListener L = new aiu(this);
    private final View.OnKeyListener M = new aiv(this);
    public int a;
    public int b;
    public boolean c;
    public SeekBar d;
    public boolean e;
    public boolean f;
    private int g;
    private int h;
    private TextView i;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.f16530_resource_name_obfuscated_res_0x7f040674, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ait.k, R.attr.f16530_resource_name_obfuscated_res_0x7f040674, 0);
        this.b = obtainStyledAttributes.getInt(3, 0);
        int i = obtainStyledAttributes.getInt(1, 100);
        int i2 = this.b;
        i = i < i2 ? i2 : i;
        if (i != this.g) {
            this.g = i;
            d();
        }
        int i3 = obtainStyledAttributes.getInt(4, 0);
        if (i3 != this.h) {
            this.h = Math.min(this.g - this.b, Math.abs(i3));
            d();
        }
        this.e = obtainStyledAttributes.getBoolean(2, true);
        this.K = obtainStyledAttributes.getBoolean(5, false);
        this.f = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    private final void o(int i, boolean z) {
        int i2 = this.b;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.g;
        if (i > i3) {
            i = i3;
        }
        if (i != this.a) {
            this.a = i;
            l(i);
            if (Y() && i != q(i ^ (-1))) {
                aia t = t();
                if (t != null) {
                    t.h(this.t, i);
                } else {
                    SharedPreferences.Editor b = this.k.b();
                    b.putInt(this.t, i);
                    super.S(b);
                }
            }
            if (!z) {
                return;
            }
            d();
        }
    }

    @Override // androidx.preference.Preference
    public final void a(ais aisVar) {
        super.a(aisVar);
        aisVar.a.setOnKeyListener(this.M);
        this.d = (SeekBar) aisVar.F(R.id.f68250_resource_name_obfuscated_res_0x7f0b08d4);
        TextView textView = (TextView) aisVar.F(R.id.f68260_resource_name_obfuscated_res_0x7f0b08d5);
        this.i = textView;
        if (this.K) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.i = null;
        }
        SeekBar seekBar = this.d;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.L);
        this.d.setMax(this.g - this.b);
        int i = this.h;
        if (i != 0) {
            this.d.setKeyProgressIncrement(i);
        } else {
            this.h = this.d.getKeyProgressIncrement();
        }
        this.d.setProgress(this.a - this.b);
        l(this.a);
        this.d.setEnabled(X());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final Parcelable e() {
        Parcelable e = super.e();
        if (this.x) {
            return e;
        }
        aiw aiwVar = new aiw(e);
        aiwVar.a = this.a;
        aiwVar.b = this.b;
        aiwVar.c = this.g;
        return aiwVar;
    }

    @Override // androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(aiw.class)) {
            super.g(parcelable);
            return;
        }
        aiw aiwVar = (aiw) parcelable;
        super.g(aiwVar.getSuperState());
        this.a = aiwVar.a;
        this.b = aiwVar.b;
        this.g = aiwVar.c;
        d();
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        o(q(((Integer) obj).intValue()), true);
    }

    public final void k(SeekBar seekBar) {
        int progress = this.b + seekBar.getProgress();
        if (progress != this.a) {
            if (U(Integer.valueOf(progress))) {
                o(progress, false);
                return;
            }
            seekBar.setProgress(this.a - this.b);
            l(this.a);
        }
    }

    public final void l(int i) {
        TextView textView = this.i;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }
}
