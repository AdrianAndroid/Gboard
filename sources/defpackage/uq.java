package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.inputmethod.latin.R;
import java.io.File;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: uq  reason: default package */
/* loaded from: classes2.dex */
public final class uq {
    public static File[] a(Context context) {
        return context.getExternalCacheDirs();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File[] b(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    static File[] c(Context context) {
        return context.getObbDirs();
    }

    public static final void d(View view) {
        Iterator a = oll.n(new aai(view, null)).a();
        while (a.hasNext()) {
            e((View) a.next()).n();
        }
    }

    public static final aqr e(View view) {
        aqr aqrVar = (aqr) view.getTag(R.id.f67220_resource_name_obfuscated_res_0x7f0b0846);
        if (aqrVar == null) {
            aqr aqrVar2 = new aqr((char[]) null, (byte[]) null);
            view.setTag(R.id.f67220_resource_name_obfuscated_res_0x7f0b0846, aqrVar2);
            return aqrVar2;
        }
        return aqrVar;
    }
}
