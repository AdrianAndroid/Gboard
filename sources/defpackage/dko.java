package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: dko  reason: default package */
/* loaded from: classes.dex */
public final class dko {
    public static final ibz a = ibz.a("alphabet_12keys");
    public static final ibz b = ibz.a("alphabet_qwerty");
    public static final ibz c = ibz.a("tri_state_digit");

    public static ibz a(Context context, iav iavVar, ino inoVar) {
        if (iavVar.b.equals(context.getString(R.string.f167300_resource_name_obfuscated_res_0x7f14093b)) || iavVar.b.equals(context.getString(R.string.f167310_resource_name_obfuscated_res_0x7f14093c)) || iavVar.b.equals(context.getString(R.string.f167320_resource_name_obfuscated_res_0x7f14093d))) {
            return inoVar.aj(R.string.f161520_resource_name_obfuscated_res_0x7f1406b9) ? b : ibz.a;
        }
        if (!iavVar.b.equals(context.getString(R.string.f167280_resource_name_obfuscated_res_0x7f140939)) && !inoVar.aj(R.string.f161480_resource_name_obfuscated_res_0x7f1406b5)) {
            return a;
        }
        return b;
    }
}
