package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: lar  reason: default package */
/* loaded from: classes.dex */
public final class lar extends Enum implements lan {
    public static final lar a;
    public static final AtomicReference b = new AtomicReference(null);
    private static final /* synthetic */ lar[] c;

    static {
        lar larVar = new lar();
        a = larVar;
        c = new lar[]{larVar};
    }

    private lar() {
    }

    public static lar[] values() {
        return (lar[]) c.clone();
    }

    @Override // defpackage.lan
    public final lao a() {
        return (lao) b.get();
    }
}
