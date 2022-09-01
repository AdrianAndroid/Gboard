package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/* compiled from: PG */
/* renamed from: agz  reason: default package */
/* loaded from: classes.dex */
public final class agz extends ahe implements Runnable {
    public boolean a;
    final /* synthetic */ aha b;

    public agz(aha ahaVar) {
        this.b = ahaVar;
    }

    @Override // defpackage.ahe
    public final Object a() {
        try {
            aha ahaVar = this.b;
            TreeSet treeSet = new TreeSet();
            String[] split = kez.g(ahaVar.f.getApplicationContext(), "third_party_license_metadata", 0L, -1).split("\n");
            ArrayList arrayList = new ArrayList(split.length);
            for (String str : split) {
                int indexOf = str.indexOf(32);
                String[] split2 = str.substring(0, indexOf).split(":");
                jdg.G(split2.length == 2 && indexOf > 0, "Invalid license meta-data line:\n".concat(String.valueOf(str)));
                arrayList.add(new kmz(str.substring(indexOf + 1), Long.parseLong(split2[0]), Integer.parseInt(split2[1])));
            }
            Collections.sort(arrayList);
            treeSet.addAll(arrayList);
            return Collections.unmodifiableList(new ArrayList(treeSet));
        } catch (wy e) {
            if (!f()) {
                throw e;
            }
            return null;
        }
    }

    @Override // defpackage.ahe
    public final void b(Object obj) {
        aha ahaVar = this.b;
        if (ahaVar.a != this) {
            ahaVar.c(this);
        } else if (ahaVar.h) {
        } else {
            SystemClock.uptimeMillis();
            ahaVar.a = null;
            ahaVar.b((List) obj);
        }
    }

    @Override // defpackage.ahe
    public final void c() {
        this.b.c(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = false;
        this.b.a();
    }
}
