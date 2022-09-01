package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.google.android.inputmethod.latin.R;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: brv  reason: default package */
/* loaded from: classes.dex */
public final class brv extends guh {
    final /* synthetic */ brw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brv(brw brwVar) {
        super("ClearDictionary");
        this.a = brwVar;
    }

    @Override // defpackage.guh
    protected final void a(gub gubVar) {
        boolean a = gul.a();
        gubVar.D(R.string.f163850_resource_name_obfuscated_res_0x7f1407c0);
        gubVar.F(a ? R.layout.f144940_resource_name_obfuscated_res_0x7f0e0518 : R.layout.f144930_resource_name_obfuscated_res_0x7f0e0517);
        gubVar.n(false);
        gubVar.m(true != a ? -2 : -3, 17039360, gub.c);
        gubVar.C(17039370, gub.d);
    }

    @Override // defpackage.guh
    protected final void b(final Dialog dialog) {
        final AppCompatTextView appCompatTextView = (AppCompatTextView) dialog.findViewById(R.id.f52810_resource_name_obfuscated_res_0x7f0b00d2);
        appCompatTextView.setText(String.format(Locale.ROOT, "%04d", Integer.valueOf(this.a.d)));
        final AppCompatEditText appCompatEditText = (AppCompatEditText) dialog.findViewById(R.id.f56650_resource_name_obfuscated_res_0x7f0b029a);
        guw.c(dialog, -1).setOnClickListener(new View.OnClickListener() { // from class: bru
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                brv brvVar = brv.this;
                AppCompatEditText appCompatEditText2 = appCompatEditText;
                AppCompatTextView appCompatTextView2 = appCompatTextView;
                Dialog dialog2 = dialog;
                if (TextUtils.equals(appCompatEditText2.mo22getText(), appCompatTextView2.getText())) {
                    brvVar.a.e.J(false);
                    brw brwVar = brvVar.a;
                    brwVar.d(3, true);
                    if (brwVar.g == null) {
                        brwVar.g = new brt(brwVar.c);
                    }
                    mko a = brwVar.g.a();
                    if (jez.e(brwVar.c)) {
                        mko a2 = jco.c(jez.a(brwVar.c)).a();
                        jfb.c(a2, jfc.CLEAR_USER_DICTIONARY, "");
                        kcu.U(a2, new cbx(1), gyc.b);
                    }
                    kcu.U(a, new buo(brwVar, 1), gyc.b);
                    brvVar.a.d = brw.b();
                    dialog2.dismiss();
                    return;
                }
                appCompatEditText2.setText("");
                Context context = dialog2.getContext();
                Toast makeText = Toast.makeText(context, context.getString(R.string.f154320_resource_name_obfuscated_res_0x7f14035f), 0);
                makeText.setGravity(17, 0, 0);
                makeText.show();
            }
        });
    }
}
