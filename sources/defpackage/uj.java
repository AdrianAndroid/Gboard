package defpackage;

import android.app.Notification;

/* compiled from: PG */
/* renamed from: uj  reason: default package */
/* loaded from: classes2.dex */
final class uj {
    final String a;
    final int b;
    final String c;
    final Notification d;

    public uj(String str, int i, String str2, Notification notification) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = notification;
    }

    public final String toString() {
        return "NotifyTask[packageName:" + this.a + ", id:" + this.b + ", tag:" + this.c + "]";
    }
}
