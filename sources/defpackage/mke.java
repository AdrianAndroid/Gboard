package defpackage;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: mke  reason: default package */
/* loaded from: classes.dex */
final class mke extends Enum {
    public static final mke a;
    public static final Set b = new CopyOnWriteArraySet();
    private static final /* synthetic */ mke[] c;

    static {
        mke mkeVar = new mke();
        a = mkeVar;
        c = new mke[]{mkeVar};
    }

    private mke() {
    }

    public static mke[] values() {
        return (mke[]) c.clone();
    }
}
