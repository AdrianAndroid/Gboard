package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: lwa  reason: default package */
/* loaded from: classes.dex */
public final class lwa implements lvr {
    public final Set a;
    public final luy b;
    private final Level c;

    public lwa() {
        this(Level.ALL, lwc.a, lwc.b);
    }

    public lwa(Level level, Set set, luy luyVar) {
        this.c = level;
        this.a = set;
        this.b = luyVar;
    }

    @Override // defpackage.lvr
    public final lun a(String str) {
        return new lwc(str, this.c, this.a, this.b);
    }
}
