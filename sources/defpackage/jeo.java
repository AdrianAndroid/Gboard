package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jeo  reason: default package */
/* loaded from: classes.dex */
public abstract class jeo implements Parcelable {
    private static int g(int i) {
        return ((int) (i / 0.75f)) + 1;
    }

    protected final Object a(Parcel parcel) {
        byte readByte = parcel.readByte();
        boolean z = false;
        switch (readByte) {
            case 0:
                return null;
            case 1:
                if (parcel.readByte() != 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                return parcel.readString();
            case 3:
                return Integer.valueOf(parcel.readInt());
            case 4:
                return Float.valueOf(parcel.readFloat());
            case 5:
                return Long.valueOf(parcel.readLong());
            case 6:
                return c(parcel);
            case 7:
                return b(parcel);
            default:
                throw new IllegalArgumentException(String.format("unrecognized type '%d'", Integer.valueOf(readByte)));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final HashMap b(Parcel parcel) {
        int readInt = parcel.readInt();
        HashMap hashMap = new HashMap(g(readInt), 0.75f);
        for (int i = 0; i < readInt; i++) {
            hashMap.put(a(parcel), a(parcel));
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final HashSet c(Parcel parcel) {
        int readInt = parcel.readInt();
        HashSet hashSet = new HashSet(g(readInt), 0.75f);
        for (int i = 0; i < readInt; i++) {
            hashSet.add(a(parcel));
        }
        return hashSet;
    }

    public final void d(Parcel parcel, Collection collection) {
        parcel.writeInt(collection.size());
        for (Object obj : collection) {
            f(parcel, obj);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(Parcel parcel, Map map) {
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            f(parcel, entry.getKey());
            f(parcel, entry.getValue());
        }
    }

    protected final void f(Parcel parcel, Object obj) {
        if (obj == null) {
            parcel.writeByte((byte) 0);
        } else if (obj instanceof Boolean) {
            parcel.writeByte((byte) 1);
            parcel.writeByte(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
        } else if (obj instanceof String) {
            parcel.writeByte((byte) 2);
            parcel.writeString((String) obj);
        } else if (obj instanceof Integer) {
            parcel.writeByte((byte) 3);
            parcel.writeInt(((Integer) obj).intValue());
        } else if (obj instanceof Float) {
            parcel.writeByte((byte) 4);
            parcel.writeFloat(((Float) obj).floatValue());
        } else if (obj instanceof Long) {
            parcel.writeByte((byte) 5);
            parcel.writeLong(((Long) obj).longValue());
        } else if (obj instanceof Set) {
            parcel.writeByte((byte) 6);
            d(parcel, (Set) obj);
        } else if (!(obj instanceof Map)) {
            throw new IllegalArgumentException(String.format("unrecognized type for %s", obj));
        } else {
            parcel.writeByte((byte) 7);
            e(parcel, (Map) obj);
        }
    }
}
