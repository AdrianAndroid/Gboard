package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DataHolder extends frw implements Closeable {
    public static final Parcelable.Creator CREATOR = new fmq(10);
    final int a;
    public final String[] b;
    public Bundle c;
    public final CursorWindow[] d;
    public final int e;
    public final Bundle f;
    public int[] g;
    boolean h = false;
    private boolean i = true;

    static {
        String[] strArr = new String[0];
        new ArrayList();
        new HashMap();
    }

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.a = i;
        this.b = strArr;
        this.d = cursorWindowArr;
        this.e = i2;
        this.f = bundle;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (!this.h) {
                this.h = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.d;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    protected final void finalize() {
        boolean z;
        try {
            if (this.i && this.d.length > 0) {
                synchronized (this) {
                    z = this.h;
                }
                if (!z) {
                    close();
                    String obj = toString();
                    Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + obj + ")");
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.T(parcel, 1, this.b);
        fyb.V(parcel, 2, this.d, i);
        fyb.I(parcel, 3, this.e);
        fyb.K(parcel, 4, this.f);
        fyb.I(parcel, 1000, this.a);
        fyb.E(parcel, C);
        if ((i & 1) != 0) {
            close();
        }
    }
}
