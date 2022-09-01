package com.google.firebase;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements mmu {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // defpackage.mmu
    public final List getComponents() {
        ArrayList arrayList = new ArrayList();
        mmq a = mmr.a(moo.class);
        a.b(mmz.b(mol.class));
        a.c(mod.c);
        arrayList.add(a.a());
        mmq b = mmr.b(moe.class, mog.class, moh.class);
        b.b(mmz.a(Context.class));
        b.b(mmz.a(mmk.class));
        b.b(mmz.b(mof.class));
        b.b(new mmz(moo.class, 1, 1));
        b.c(mod.a);
        arrayList.add(b.a());
        arrayList.add(msc.i("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(msc.i("fire-core", "20.0.1_1p"));
        arrayList.add(msc.i("device-name", a(Build.PRODUCT)));
        arrayList.add(msc.i("device-model", a(Build.DEVICE)));
        arrayList.add(msc.i("device-brand", a(Build.BRAND)));
        arrayList.add(msc.j("android-target-sdk", mml.b));
        arrayList.add(msc.j("android-min-sdk", mml.a));
        arrayList.add(msc.j("android-platform", mml.c));
        arrayList.add(msc.j("android-installer", mml.d));
        return arrayList;
    }
}
