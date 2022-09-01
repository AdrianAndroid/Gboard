package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: fun  reason: default package */
/* loaded from: classes.dex */
public final class fun extends frw {
    public static final Parcelable.Creator CREATOR = new fuo(0);
    ParcelFileDescriptor a;
    final String b;
    final String c;
    byte[] d;
    public File e;

    public fun(ParcelFileDescriptor parcelFileDescriptor, String str, String str2) {
        this.a = parcelFileDescriptor;
        this.b = str;
        this.c = str2;
    }

    public fun(byte[] bArr) {
        this(null, "text/plain", "ngaLog.log");
        this.d = bArr;
    }

    static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("FileTeleporter", "Could not close stream", e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.a == null) {
            File file = this.e;
            if (file != null) {
                try {
                    File createTempFile = File.createTempFile("teleporter", ".tmp", file);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                        this.a = ParcelFileDescriptor.open(createTempFile, 268435456);
                        createTempFile.delete();
                        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
                        try {
                            try {
                                dataOutputStream.writeInt(this.d.length);
                                dataOutputStream.writeUTF(this.b);
                                dataOutputStream.writeUTF(this.c);
                                dataOutputStream.write(this.d);
                            } catch (IOException e) {
                                throw new IllegalStateException("Could not write into unlinked file", e);
                            }
                        } finally {
                            a(dataOutputStream);
                        }
                    } catch (FileNotFoundException unused) {
                        throw new IllegalStateException("Temporary file is somehow already deleted.");
                    }
                } catch (IOException e2) {
                    throw new IllegalStateException("Could not create temporary file:", e2);
                }
            } else {
                throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel.");
            }
        }
        int C = fyb.C(parcel);
        fyb.R(parcel, 2, this.a, i);
        fyb.S(parcel, 3, this.b);
        fyb.S(parcel, 4, this.c);
        fyb.E(parcel, C);
    }
}
