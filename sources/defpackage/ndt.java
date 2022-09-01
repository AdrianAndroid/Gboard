package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* renamed from: ndt  reason: default package */
/* loaded from: classes2.dex */
public abstract class ndt implements ngy {
    public static void cs(Iterable iterable, List list) {
        ngb.h(iterable);
        if (iterable instanceof ngl) {
            List h = ((ngl) iterable).h();
            ngl nglVar = (ngl) list;
            int size = list.size();
            for (Object obj : h) {
                if (obj != null) {
                    if (obj instanceof nem) {
                        nglVar.i((nem) obj);
                    } else {
                        nglVar.add((String) obj);
                    }
                } else {
                    int size2 = nglVar.size();
                    String str = "Element at index " + (size2 - size) + " is null.";
                    int size3 = nglVar.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            break;
                        }
                        nglVar.remove(size3);
                    }
                    throw new NullPointerException(str);
                }
            }
        } else if (!(iterable instanceof nhg)) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size4 = list.size();
            for (Object obj2 : iterable) {
                if (obj2 != null) {
                    list.add(obj2);
                } else {
                    int size5 = list.size();
                    String str2 = "Element at index " + (size5 - size4) + " is null.";
                    int size6 = list.size();
                    while (true) {
                        size6--;
                        if (size6 < size4) {
                            break;
                        }
                        list.remove(size6);
                    }
                    throw new NullPointerException(str2);
                }
            }
        } else {
            list.addAll((Collection) iterable);
        }
    }

    @Override // 
    /* renamed from: cn */
    public abstract ndt clone();

    protected abstract ndt co(ndu nduVar);

    @Override // defpackage.ngy
    /* renamed from: cp */
    public final ndt cr(byte[] bArr, nfb nfbVar) {
        return cv(bArr, bArr.length, nfbVar);
    }

    @Override // defpackage.ngy
    public final /* bridge */ /* synthetic */ ngy cq(ngz ngzVar) {
        if (!cB().getClass().isInstance(ngzVar)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        return co((ndu) ngzVar);
    }

    public abstract void ct(ner nerVar, nfb nfbVar);

    public final void cu(InputStream inputStream, nfb nfbVar) {
        ner H = ner.H(inputStream);
        ct(H, nfbVar);
        H.z(0);
    }

    public ndt cv(byte[] bArr, int i, nfb nfbVar) {
        throw null;
    }
}
