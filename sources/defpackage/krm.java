package defpackage;

import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* renamed from: krm  reason: default package */
/* loaded from: classes.dex */
public final class krm {
    public final int a;
    public final Object b;

    public krm(int i) {
        this.b = null;
        this.a = i;
    }

    public krm(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public krm(int i, Collection collection) {
        this.a = i;
        dav a = daw.a();
        a.b();
        a.a = i;
        a.c();
        this.b = a.a();
        for (Object obj : lre.aa(collection, i)) {
            ((daw) this.b).put(obj, true);
        }
    }

    public krm(int i, leq leqVar) {
        this.a = i;
        this.b = leqVar;
    }

    @Deprecated
    public krm(int i, gjk[] gjkVarArr, byte[] bArr) {
        this.a = i;
        this.b = gjkVarArr;
    }

    public krm(Typeface typeface) {
        this.b = typeface;
        this.a = 0;
    }

    public krm(fhr fhrVar, int i, byte[] bArr) {
        this.b = fhrVar;
        this.a = i;
    }

    public krm(Object obj, int i) {
        this.b = obj;
        this.a = i;
    }

    public krm(String str, int i) {
        this.b = str;
        this.a = i;
    }

    public static krm b(int i, gjk[] gjkVarArr) {
        return new krm(i, gjkVarArr, (byte[]) null);
    }

    public final Set a() {
        return ((daw) this.b).keySet();
    }

    public krm(fmt fmtVar, int i) {
        fyb.ax(fmtVar);
        this.b = fmtVar;
        this.a = i;
    }

    public krm() {
        this.a = 1;
        this.b = new ArrayList();
    }
}
