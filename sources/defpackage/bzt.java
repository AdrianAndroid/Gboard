package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: bzt  reason: default package */
/* loaded from: classes.dex */
public final class bzt {
    public final String a;
    public jqa b;
    public List c;
    public juh d;
    public int e = 0;
    public int f = 0;
    public fen g = null;

    public bzt(String str) {
        this.a = str;
    }

    public final bzu a() {
        return new bzu(this);
    }

    public final void b(jty jtyVar) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        this.c.add(jtyVar);
    }
}
