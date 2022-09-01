package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: dde  reason: default package */
/* loaded from: classes.dex */
public abstract class dde extends LinearLayout {
    public final int a;
    public boolean b;
    private Button c;
    private View d;

    public dde(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = jgd.f(context, attributeSet, null, "pageId", 0);
    }

    private final void d() {
        boolean c = c();
        Button button = this.c;
        int i = 8;
        if (button != null) {
            button.setVisibility(true != c ? 0 : 8);
        }
        View view = this.d;
        if (view != null) {
            if (true == c) {
                i = 0;
            }
            view.setVisibility(i);
        }
        if (this.b && c) {
            post(new cvj(this, 14));
        }
        this.b = false;
    }

    protected CharSequence a() {
        throw null;
    }

    public abstract void b();

    protected abstract boolean c();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.b = false;
        ((AppCompatTextView) findViewById(R.id.f55440_resource_name_obfuscated_res_0x7f0b0209)).setText(getContext().getString(R.string.f166140_resource_name_obfuscated_res_0x7f1408ba, Integer.valueOf(((ddi) getContext()).n(this.a) + 1)));
        Button button = (Button) findViewById(R.id.f55400_resource_name_obfuscated_res_0x7f0b0205);
        this.c = button;
        if (button != null) {
            button.setOnClickListener(new cjr(this, 7));
        }
        CharSequence a = a();
        if (a != null) {
            ((AppCompatTextView) findViewById(R.id.f55410_resource_name_obfuscated_res_0x7f0b0206)).setText(a);
        }
        this.d = findViewById(R.id.f55420_resource_name_obfuscated_res_0x7f0b0207);
        d();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            d();
        }
    }
}
