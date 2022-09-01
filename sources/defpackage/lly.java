package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Map;

/* compiled from: PG */
/* renamed from: lly  reason: default package */
/* loaded from: classes.dex */
abstract class lly extends lmz {
    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    public abstract llw a();

    @Override // defpackage.llg, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = a().get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.lmz
    public final boolean d() {
        return false;
    }

    @Override // defpackage.lmz, java.util.Collection, java.util.Set
    public final int hashCode() {
        return a().hashCode();
    }

    @Override // defpackage.llg
    public final boolean m() {
        return a().ig();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return a().size();
    }

    @Override // defpackage.lmz, defpackage.llg
    Object writeReplace() {
        return new llx(a());
    }
}
