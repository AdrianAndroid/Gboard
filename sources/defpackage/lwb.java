package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lwb  reason: default package */
/* loaded from: classes.dex */
public final class lwb extends lvp {
    private final Level a;
    private final Set b;
    private final luy c;

    public lwb(String str, Level level, Set set, luy luyVar) {
        super(str);
        this.a = level;
        this.b = set;
        this.c = luyVar;
    }

    @Override // defpackage.lun
    public final void b(lum lumVar) {
        String str = (String) lumVar.m().d(luh.a);
        if (str == null) {
            str = d();
        }
        if (str == null) {
            str = lumVar.f().b();
            int indexOf = str.indexOf(36, str.lastIndexOf(46));
            if (indexOf >= 0) {
                str = str.substring(0, indexOf);
            }
        }
        lwc.a(lumVar, lvw.c(str), this.a, this.b, this.c);
    }

    @Override // defpackage.lun
    public final boolean c(Level level) {
        return true;
    }
}
