package defpackage;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.widget.Button;
import com.google.android.inputmethod.latin.R;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: kon  reason: default package */
/* loaded from: classes.dex */
public final class kon {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public kon(Context context, iqa iqaVar) {
        this.c = "EnjoyGboard-settings";
        this.b = "RateGboard-settings";
        this.e = context;
        this.f = iqaVar;
        this.d = new iqc(this, "EnjoyGboard-settings", null);
        this.a = new iqd(this, "RateGboard-settings", null);
    }

    public kon(kom komVar) {
        this.f = komVar.a;
        this.a = komVar.b;
        this.b = komVar.c;
        this.c = komVar.d;
        this.d = komVar.e;
        this.e = komVar.f;
    }

    public static void c(Dialog dialog) {
        e(dialog, -1);
        e(dialog, -2);
    }

    private static void e(Dialog dialog, int i) {
        Button c = guw.c(dialog, i);
        if (c != null) {
            c.setAllCaps(false);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List, java.lang.Object] */
    public final List a(OutputStream outputStream) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStream);
        if (!this.c.isEmpty()) {
            ?? r1 = this.c;
            Object obj = this.d;
            ArrayList arrayList2 = new ArrayList();
            for (kpx kpxVar : r1) {
                kpw b = kpxVar.b((Uri) obj);
                if (b != null) {
                    arrayList2.add(b);
                }
            }
            kol kolVar = !arrayList2.isEmpty() ? new kol(outputStream, arrayList2) : null;
            if (kolVar != null) {
                arrayList.add(kolVar);
            }
        }
        for (kpy kpyVar : this.b) {
            arrayList.add(kpyVar.c((OutputStream) lre.ac(arrayList)));
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final boolean b() {
        return !this.b.isEmpty();
    }

    public final void d() {
        ieh.j().e(iqb.a, 3, this.f);
        Resources resources = ((Context) this.e).getResources();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(resources.getString(R.string.f152940_resource_name_obfuscated_res_0x7f1402b1)));
        hsk b = hsx.b();
        int i = ((b != null ? b.F() : null) == null ? 524288 : 268435456) | 1207959552;
        intent.addFlags(i);
        intent.setPackage("com.android.vending");
        try {
            ((Context) this.e).startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(resources.getString(R.string.f152950_resource_name_obfuscated_res_0x7f1402b2)));
            intent2.addFlags(i);
            ((Context) this.e).startActivity(intent2);
        }
    }
}
