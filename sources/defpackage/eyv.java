package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.URLSpan;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: eyv  reason: default package */
/* loaded from: classes.dex */
public final class eyv extends guh {
    public final /* synthetic */ gwv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyv(gwv gwvVar, byte[] bArr, byte[] bArr2) {
        super("PrivacyTerm");
        this.a = gwvVar;
    }

    @Override // defpackage.guh
    public final void a(gub gubVar) {
        URLSpan[] uRLSpanArr;
        Context r = gubVar.r();
        boolean a = gul.a();
        gubVar.D(R.string.f176920_resource_name_obfuscated_res_0x7f140d07);
        SpannableString spannableString = new SpannableString(r.getText(R.string.f176910_resource_name_obfuscated_res_0x7f140d06));
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            int spanFlags = spannableString.getSpanFlags(uRLSpan);
            String url = uRLSpan.getURL();
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new jbo(url, url, r), spanStart, spanEnd, spanFlags);
        }
        if (a) {
            jbr.a(spannableString);
        }
        gubVar.A(spannableString);
        gubVar.C(R.string.f156060_resource_name_obfuscated_res_0x7f140412, new ees(this, 6));
        gubVar.m(true != a ? -2 : -3, R.string.f155880_resource_name_obfuscated_res_0x7f140400, new ees(this, 6));
        gubVar.v();
        gubVar.j();
        gubVar.i();
    }
}
