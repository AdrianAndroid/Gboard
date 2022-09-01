package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* renamed from: oy  reason: default package */
/* loaded from: classes2.dex */
public final class oy {
    public final /* synthetic */ bi c;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public boolean a = false;

    public oy(bi biVar) {
        this.c = biVar;
    }

    public final void a(ou ouVar) {
        this.b.add(ouVar);
    }

    public final void b(ou ouVar) {
        this.b.remove(ouVar);
    }

    public oy() {
    }
}
