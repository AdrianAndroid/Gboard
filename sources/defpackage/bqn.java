package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.AutoSizeTextView;

/* compiled from: PG */
/* renamed from: bqn  reason: default package */
/* loaded from: classes.dex */
public final class bqn extends imo {
    public final Runnable a;
    public final boolean b;
    private final bqo c;

    public bqn(Context context, imn imnVar, bqo bqoVar, Runnable runnable, boolean z) {
        super(context, imnVar);
        this.c = bqoVar;
        this.a = runnable;
        this.b = z;
    }

    @Override // defpackage.imo
    public final int a() {
        return this.b ? R.string.f158440_resource_name_obfuscated_res_0x7f140550 : R.string.f158450_resource_name_obfuscated_res_0x7f140551;
    }

    @Override // defpackage.imo
    protected final View b(View view) {
        View b = this.m.b(this.k, R.layout.f143610_resource_name_obfuscated_res_0x7f0e0479);
        if (this.b) {
            ((AutoSizeTextView) b.findViewById(R.id.f66090_resource_name_obfuscated_res_0x7f0b07bf)).setText(R.string.f158440_resource_name_obfuscated_res_0x7f140550);
        }
        b.setEnabled(true);
        b.setClickable(true);
        AppCompatTextView appCompatTextView = (AppCompatTextView) b.findViewById(R.id.f66100_resource_name_obfuscated_res_0x7f0b07c0);
        appCompatTextView.setMovementMethod(ScrollingMovementMethod.getInstance());
        String[] stringArray = this.k.getResources().getStringArray(this.c.c);
        appCompatTextView.setText(TextUtils.join("    ", stringArray));
        appCompatTextView.setBreakStrategy(2);
        int length = stringArray.length;
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) b.findViewById(R.id.f65930_resource_name_obfuscated_res_0x7f0b07a9);
        if (this.c.a(this.k) - length > 0) {
            appCompatTextView2.setText(this.k.getResources().getString(R.string.f158430_resource_name_obfuscated_res_0x7f14054f));
        } else {
            appCompatTextView2.setVisibility(4);
        }
        ((Button) b.findViewById(R.id.f66820_resource_name_obfuscated_res_0x7f0b0818)).setOnClickListener(new hk(this, 7));
        ((Button) b.findViewById(R.id.f52760_resource_name_obfuscated_res_0x7f0b00cd)).setOnClickListener(new hk(this, 8));
        return b;
    }

    public final void c() {
        long currentTimeMillis = System.currentTimeMillis();
        ieh j = ieh.j();
        if (this.b) {
            this.l.q(R.string.f162140_resource_name_obfuscated_res_0x7f1406f7, true);
            this.l.t(R.string.f162120_resource_name_obfuscated_res_0x7f1406f5, currentTimeMillis);
            j.e(dda.NATIVE_LANGUAGE_HINT_SEARCH_USER_EVENTS, 1);
        } else {
            this.l.q(R.string.f162150_resource_name_obfuscated_res_0x7f1406f8, true);
            this.l.t(R.string.f162100_resource_name_obfuscated_res_0x7f1406f3, currentTimeMillis);
            j.e(dda.NATIVE_LANGUAGE_HINT_USER_EVENTS, 1);
        }
        m();
    }

    @Override // defpackage.imo
    public final void d(View view) {
        dda ddaVar;
        super.d(view);
        ieh j = ieh.j();
        if (this.b) {
            ddaVar = dda.NATIVE_LANGUAGE_HINT_SEARCH_USER_EVENTS;
        } else {
            ddaVar = dda.NATIVE_LANGUAGE_HINT_USER_EVENTS;
        }
        j.e(ddaVar, 1);
    }

    @Override // defpackage.imo
    public final boolean e() {
        return false;
    }
}
