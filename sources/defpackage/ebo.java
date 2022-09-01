package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ebo  reason: default package */
/* loaded from: classes.dex */
public final class ebo implements ebn {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/emoticon/accessibility/EmoticonDescriptionProviderImpl");
    private final Context b;
    private final igr c;

    public ebo(Context context) {
        igr d = igr.d(context);
        this.b = context;
        this.c = d;
    }

    @Override // defpackage.ebn
    public final String c() {
        ebp ebpVar = (ebp) this.c.a(ebp.class);
        if (ebpVar == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/search/emoticon/accessibility/EmoticonDescriptionProviderImpl", "getContentDescription", 32, "EmoticonDescriptionProviderImpl.java")).t("Emoticon description provider module is unavailable");
            return this.b.getResources().getString(R.string.f151130_resource_name_obfuscated_res_0x7f1401e7);
        }
        return ebpVar.a.getResources().getString(R.string.f151130_resource_name_obfuscated_res_0x7f1401e7);
    }
}
