package defpackage;

import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* renamed from: ijr  reason: default package */
/* loaded from: classes.dex */
public final class ijr {
    final int a;
    public final String[] b;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    public ijr(int i, String[] strArr) {
        this.a = i;
        this.b = strArr;
    }

    public final String toString() {
        int i = this.a;
        String arrays = Arrays.toString(this.b);
        String obj = this.c.toString();
        return "FeatureInfo : Description = " + i + " : Permissions=" + arrays + " : Listeners=" + obj;
    }
}
