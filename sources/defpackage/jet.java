package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jet  reason: default package */
/* loaded from: classes.dex */
public final class jet implements fkd {
    public static final Parcelable.Creator CREATOR = new icc(7);

    public jet() {
    }

    public jet(byte[] bArr) {
    }

    @Override // defpackage.fkd
    public final Object a(Bundle bundle, String str, fke fkeVar) {
        bundle.setClassLoader(fkd.class.getClassLoader());
        if ("java.lang.Void".equals(fkeVar.a)) {
            return null;
        }
        if ("boolean".equals(fkeVar.a)) {
            return Boolean.valueOf(bundle.getBoolean(str));
        }
        if ("com.google.android.libraries.inputmethod.workprofile.PreferenceValues".equals(fkeVar.a)) {
            return (jep) bundle.getParcelable(str);
        }
        if ("com.google.android.libraries.inputmethod.workprofile.AllowedSharedPreferences".equals(fkeVar.a)) {
            return (jed) bundle.getParcelable(str);
        }
        if ("java.lang.String".equals(fkeVar.a)) {
            return bundle.getString(str);
        }
        if ("java.util.Set".equals(fkeVar.a)) {
            return ((fki) bundle.getParcelable(str)).a;
        }
        if ("float".equals(fkeVar.a)) {
            return Float.valueOf(bundle.getFloat(str));
        }
        if ("long".equals(fkeVar.a)) {
            return Long.valueOf(bundle.getLong(str));
        }
        if ("int".equals(fkeVar.a)) {
            return Integer.valueOf(bundle.getInt(str));
        }
        String str2 = fkeVar.a;
        throw new IllegalArgumentException("Type " + str2 + " cannot be read from Bundle");
    }

    @Override // defpackage.fkd
    public final Object b(Parcel parcel, fke fkeVar) {
        if ("java.lang.Void".equals(fkeVar.a)) {
            return null;
        }
        if ("boolean".equals(fkeVar.a)) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        } else if ("com.google.android.libraries.inputmethod.workprofile.PreferenceValues".equals(fkeVar.a)) {
            return (jep) parcel.readParcelable(fkd.class.getClassLoader());
        } else {
            if ("com.google.android.libraries.inputmethod.workprofile.AllowedSharedPreferences".equals(fkeVar.a)) {
                return (jed) parcel.readParcelable(fkd.class.getClassLoader());
            }
            if ("java.lang.String".equals(fkeVar.a)) {
                return parcel.readString();
            }
            if ("java.util.Set".equals(fkeVar.a)) {
                return ((fki) parcel.readParcelable(fkd.class.getClassLoader())).a;
            }
            if ("float".equals(fkeVar.a)) {
                return Float.valueOf(parcel.readFloat());
            }
            if ("long".equals(fkeVar.a)) {
                return Long.valueOf(parcel.readLong());
            }
            if ("int".equals(fkeVar.a)) {
                return Integer.valueOf(parcel.readInt());
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
        if ("com.google.android.libraries.inputmethod.workprofile.PreferenceValues".equals(fkeVar.a)) {
            bundle.putParcelable(str, (jep) obj);
        } else if ("com.google.android.libraries.inputmethod.workprofile.AllowedSharedPreferences".equals(fkeVar.a)) {
            bundle.putParcelable(str, (jed) obj);
        } else if ("java.lang.String".equals(fkeVar.a)) {
            bundle.putString(str, (String) obj);
        } else if ("java.util.Set".equals(fkeVar.a)) {
            bundle.putParcelable(str, fki.a(this, fkeVar, (Set) obj));
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
        if ("com.google.android.libraries.inputmethod.workprofile.PreferenceValues".equals(fkeVar.a)) {
            parcel.writeParcelable((jep) obj, i);
        } else if ("com.google.android.libraries.inputmethod.workprofile.AllowedSharedPreferences".equals(fkeVar.a)) {
            parcel.writeParcelable((jed) obj, i);
        } else if ("java.lang.String".equals(fkeVar.a)) {
            parcel.writeString((String) obj);
        } else if ("java.util.Set".equals(fkeVar.a)) {
            parcel.writeParcelable(fki.a(this, fkeVar, (Set) obj), i);
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
