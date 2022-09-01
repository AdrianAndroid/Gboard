package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;

/* compiled from: PG */
/* renamed from: lnd  reason: default package */
/* loaded from: classes.dex */
public class lnd extends lmn implements lrv {
    private static final long serialVersionUID = 0;
    private transient lmz a;
    public transient lnd b;
    private final transient lmz emptySet = l(null);

    public lnd(llw llwVar, int i) {
        super(llwVar, i);
    }

    public static lna g() {
        return new lna();
    }

    private static lmz l(Comparator comparator) {
        if (comparator == null) {
            return lrr.a;
        }
        return lnn.G(comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        lmx lnlVar;
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Invalid key count " + readInt);
        }
        lls h = llw.h();
        int i = 0;
        for (int i2 = 0; i2 < readInt; i2++) {
            Object readObject = objectInputStream.readObject();
            int readInt2 = objectInputStream.readInt();
            if (readInt2 > 0) {
                if (comparator == null) {
                    lnlVar = new lmx();
                } else {
                    lnlVar = new lnl(comparator);
                }
                for (int i3 = 0; i3 < readInt2; i3++) {
                    lnlVar.d(objectInputStream.readObject());
                }
                lmz g = lnlVar.g();
                if (g.size() == readInt2) {
                    h.a(readObject, g);
                    i += readInt2;
                } else {
                    new StringBuilder("Duplicate key-value pairs exist for key ").append(readObject);
                    throw new InvalidObjectException("Duplicate key-value pairs exist for key ".concat(String.valueOf(readObject)));
                }
            } else {
                throw new InvalidObjectException("Invalid value count " + readInt2);
            }
        }
        try {
            lmj.a.e(this, h.l());
            lmj.b.d(this, i);
            lnc.a.e(this, l(comparator));
        } catch (IllegalArgumentException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        lmz lmzVar = this.emptySet;
        objectOutputStream.writeObject(lmzVar instanceof lnn ? ((lnn) lmzVar).a : null);
        lvw.t(this, objectOutputStream);
    }

    @Override // defpackage.lmn
    public final /* bridge */ /* synthetic */ llg a(Object obj) {
        throw null;
    }

    @Override // defpackage.lmn, defpackage.lqr
    public final /* bridge */ /* synthetic */ Collection b(Object obj) {
        throw null;
    }

    @Override // defpackage.lmn, defpackage.ljh, defpackage.lqr
    /* renamed from: c */
    public final lmz x() {
        lmz lmzVar = this.a;
        if (lmzVar == null) {
            lnb lnbVar = new lnb(this);
            this.a = lnbVar;
            return lnbVar;
        }
        return lmzVar;
    }

    public final lmz d(Object obj) {
        return (lmz) jdg.U((lmz) this.map.get(obj), this.emptySet);
    }
}
