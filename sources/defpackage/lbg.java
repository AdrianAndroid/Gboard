package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: lbg  reason: default package */
/* loaded from: classes.dex */
public final class lbg {
    public static final jlt c = new jlt("SplitInstallService");
    private static final Intent d = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");
    public final String a;
    public kzp b;

    public lbg(Context context) {
        this.a = context.getPackageName();
        if (lbx.a(context)) {
            this.b = new kzp(lby.d(context), c, d, null, null);
        }
    }

    public static Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 11004);
        return bundle;
    }

    public static gen b() {
        c.e("onError(%d)", -14);
        return gni.d(new lau(-14));
    }

    public static ArrayList c(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }
}
