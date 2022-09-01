package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: llr  reason: default package */
/* loaded from: classes.dex */
public class llr extends lmn implements lom {
    private static final long serialVersionUID = 0;
    public transient llr b;

    public llr(llw llwVar, int i) {
        super(llwVar, i);
    }

    public static llr g(lqr lqrVar) {
        if (lqrVar.D()) {
            return lkq.a;
        }
        if (lqrVar instanceof llr) {
            llr llrVar = (llr) lqrVar;
            if (!llrVar.map.ig()) {
                return llrVar;
            }
        }
        return l(lqrVar.z().entrySet());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static llr l(Collection collection) {
        if (collection.isEmpty()) {
            return lkq.a;
        }
        lls llsVar = new lls(collection.size());
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            llp o = llp.o((Collection) entry.getValue());
            if (!o.isEmpty()) {
                llsVar.a(key, o);
                i += o.size();
            }
        }
        return new llr(llsVar.l(), i);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
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
                llk e = llp.e();
                for (int i3 = 0; i3 < readInt2; i3++) {
                    e.h(objectInputStream.readObject());
                }
                h.a(readObject, e.g());
                i += readInt2;
            } else {
                throw new InvalidObjectException("Invalid value count " + readInt2);
            }
        }
        try {
            lmj.a.e(this, h.l());
            lmj.b.d(this, i);
        } catch (IllegalArgumentException e2) {
            throw ((InvalidObjectException) new InvalidObjectException(e2.getMessage()).initCause(e2));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        lvw.t(this, objectOutputStream);
    }

    @Override // defpackage.lmn, defpackage.lqr
    public final /* bridge */ /* synthetic */ Collection b(Object obj) {
        throw null;
    }

    @Override // defpackage.lmn
    /* renamed from: c */
    public final llp a(Object obj) {
        llp llpVar = (llp) this.map.get(obj);
        return llpVar == null ? llp.q() : llpVar;
    }

    @Override // defpackage.lom
    public final /* bridge */ /* synthetic */ List d(Object obj) {
        throw null;
    }
}
