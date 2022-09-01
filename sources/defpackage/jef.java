package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: jef  reason: default package */
/* loaded from: classes.dex */
public final class jef implements fkd {
    public static final Parcelable.Creator CREATOR = new icc(4);

    public jef() {
    }

    public jef(byte[] bArr) {
    }

    @Override // defpackage.fkd
    public final Object a(Bundle bundle, String str, fke fkeVar) {
        bundle.setClassLoader(fkd.class.getClassLoader());
        if ("java.lang.Void".equals(fkeVar.a)) {
            return null;
        }
        if ("com.google.android.libraries.inputmethod.workprofile.FileContent".equals(fkeVar.a)) {
            return (jen) bundle.getParcelable(str);
        }
        if ("boolean".equals(fkeVar.a)) {
            return Boolean.valueOf(bundle.getBoolean(str));
        }
        if ("java.lang.Boolean".equals(fkeVar.a)) {
            return Boolean.valueOf(bundle.getBoolean(str));
        }
        if ("android.content.Intent".equals(fkeVar.a)) {
            return (Intent) bundle.getParcelable(str);
        }
        if ("java.lang.String".equals(fkeVar.a)) {
            return bundle.getString(str);
        }
        String str2 = fkeVar.a;
        throw new IllegalArgumentException("Type " + str2 + " cannot be read from Bundle");
    }

    @Override // defpackage.fkd
    public final Object b(Parcel parcel, fke fkeVar) {
        if ("java.lang.Void".equals(fkeVar.a)) {
            return null;
        }
        if ("com.google.android.libraries.inputmethod.workprofile.FileContent".equals(fkeVar.a)) {
            return (jen) parcel.readParcelable(fkd.class.getClassLoader());
        }
        boolean z = false;
        if ("boolean".equals(fkeVar.a)) {
            if (parcel.readInt() == 1) {
                z = true;
            }
            return Boolean.valueOf(z);
        } else if ("java.lang.Boolean".equals(fkeVar.a)) {
            if (parcel.readInt() == 1) {
                z = true;
            }
            return Boolean.valueOf(z);
        } else if ("android.content.Intent".equals(fkeVar.a)) {
            return (Intent) parcel.readParcelable(fkd.class.getClassLoader());
        } else {
            if ("java.lang.String".equals(fkeVar.a)) {
                return parcel.readString();
            }
            String str = fkeVar.a;
            throw new IllegalArgumentException("Type " + str + " cannot be read from Parcel");
        }
    }

    @Override // defpackage.fkd
    public final void c(Bundle bundle, String str, Object obj, fke fkeVar) {
        if ("java.lang.Void".equals(fkeVar.a)) {
            return;
        }
        if ("com.google.android.libraries.inputmethod.workprofile.FileContent".equals(fkeVar.a)) {
            bundle.putParcelable(str, (jen) obj);
        } else if ("java.lang.Boolean".equals(fkeVar.a)) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if ("android.content.Intent".equals(fkeVar.a)) {
            bundle.putParcelable(str, (Intent) obj);
        } else if ("java.lang.String".equals(fkeVar.a)) {
            bundle.putString(str, (String) obj);
        } else {
            String str2 = fkeVar.a;
            throw new IllegalArgumentException("Type " + str2 + " cannot be written to Bundle");
        }
    }

    @Override // defpackage.fkd
    public final void d(Parcel parcel, Object obj, fke fkeVar, int i) {
        if ("java.lang.Void".equals(fkeVar.a)) {
            return;
        }
        if ("com.google.android.libraries.inputmethod.workprofile.FileContent".equals(fkeVar.a)) {
            parcel.writeParcelable((jen) obj, i);
        } else if ("java.lang.Boolean".equals(fkeVar.a)) {
            parcel.writeInt(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if ("android.content.Intent".equals(fkeVar.a)) {
            parcel.writeParcelable((Intent) obj, i);
        } else if ("java.lang.String".equals(fkeVar.a)) {
            parcel.writeString((String) obj);
        } else {
            String str = fkeVar.a;
            throw new IllegalArgumentException("Type " + str + " cannot be written to Parcel");
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}
