package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import android.util.Log;
import com.google.android.enterprise.connectedapps.internal.BundleCallReceiver;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: PG */
/* renamed from: fkc  reason: default package */
/* loaded from: classes.dex */
public abstract class fkc {
    private final byte[] f(long j, int i, byte[] bArr) {
        int i2 = 10;
        while (true) {
            try {
                return b(j, i, bArr);
            } catch (TransactionTooLargeException e) {
                int i3 = i2 - 1;
                if (i2 <= 0) {
                    throw e;
                }
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e2) {
                    Log.w("BundleCallSender", "Interrupted on prepare retry", e2);
                }
                i2 = i3;
            }
        }
    }

    private final byte[] g(long j, int i) {
        int i2 = 10;
        while (true) {
            try {
                return c(j, i);
            } catch (TransactionTooLargeException e) {
                int i3 = i2 - 1;
                if (i2 <= 0) {
                    throw e;
                }
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e2) {
                    Log.w("BundleCallSender", "Interrupted on prepare retry", e2);
                }
                i2 = i3;
            }
        }
    }

    private final Bundle h(long j) {
        int i = 10;
        while (true) {
            try {
                Bundle d = d(j);
                d.setClassLoader(fkd.class.getClassLoader());
                return d;
            } catch (TransactionTooLargeException e) {
                int i2 = i - 1;
                if (i <= 0) {
                    throw e;
                }
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e2) {
                    Log.w("BundleCallSender", "Interrupted on prepare retry", e2);
                }
                i = i2;
            }
        }
    }

    private final void i(long j, Bundle bundle) {
        int i = 10;
        while (true) {
            try {
                e(j, bundle);
                return;
            } catch (TransactionTooLargeException e) {
                int i2 = i - 1;
                if (i <= 0) {
                    throw e;
                }
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e2) {
                    Log.w("BundleCallSender", "Interrupted on prepare retry", e2);
                }
                i = i2;
            }
        }
    }

    private final void j(long j, int i, int i2, byte[] bArr) {
        int i3 = 10;
        while (true) {
            try {
                a(j, i, i2, bArr);
                return;
            } catch (TransactionTooLargeException e) {
                int i4 = i3 - 1;
                if (i3 <= 0) {
                    throw e;
                }
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e2) {
                    Log.w("BundleCallSender", "Interrupted on prepare retry", e2);
                }
                i3 = i4;
            }
        }
    }

    public abstract void a(long j, int i, int i2, byte[] bArr);

    public abstract byte[] b(long j, int i, byte[] bArr);

    public abstract byte[] c(long j, int i);

    public abstract Bundle d(long j);

    public abstract void e(long j, Bundle bundle);

    public Bundle makeBundleCall(Bundle bundle) {
        byte[] bArr;
        int i;
        int i2;
        long mostSignificantBits = UUID.randomUUID().getMostSignificantBits();
        Parcel obtain = Parcel.obtain();
        bundle.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        int i3 = 1;
        try {
            try {
                try {
                    bArr = obtain.marshall();
                } catch (RemoteException e) {
                    throw new fka("Error passing bundle for call", e);
                }
            } finally {
                obtain.recycle();
            }
        } catch (AssertionError | RuntimeException unused) {
            i(mostSignificantBits, bundle);
            bArr = new byte[]{2};
        }
        try {
            double length = bArr.length;
            Double.isNaN(length);
            int ceil = (int) Math.ceil(length / 250000.0d);
            int i4 = 250000;
            if (ceil > 1) {
                byte[] bArr2 = new byte[250000];
                int i5 = 0;
                while (i5 < ceil - 1) {
                    System.arraycopy(bArr, i5 * i4, bArr2, 0, i4);
                    byte[] bArr3 = bArr2;
                    j(mostSignificantBits, i5, bArr.length, bArr3);
                    i5++;
                    bArr2 = bArr3;
                    i4 = 250000;
                }
                int i6 = i5;
                i = 250000;
                bArr = Arrays.copyOfRange(bArr, i6 * 250000, bArr.length);
                i2 = i6;
            } else {
                i = 250000;
                i2 = 0;
            }
            byte[] f = f(mostSignificantBits, i2, bArr);
            if (f.length == 0) {
                return null;
            }
            if (!BundleCallReceiver.b(f)) {
                if (f[0] == 1) {
                    int i7 = ByteBuffer.wrap(f).getInt(1);
                    try {
                        byte[] bArr4 = new byte[i7];
                        System.arraycopy(f, 5, bArr4, 0, i);
                        double d = i7;
                        Double.isNaN(d);
                        int ceil2 = (int) Math.ceil(d / 250000.0d);
                        while (i3 < ceil2) {
                            byte[] g = g(mostSignificantBits, i3);
                            System.arraycopy(g, 0, bArr4, i3 * i, g.length);
                            i3++;
                        }
                        f = bArr4;
                        i3 = 0;
                    } catch (RemoteException e2) {
                        throw new fka("Could not access other profile", e2);
                    }
                }
                obtain = Parcel.obtain();
                obtain.unmarshall(f, i3, f.length - i3);
                obtain.setDataPosition(0);
                Bundle bundle2 = new Bundle(fkd.class.getClassLoader());
                bundle2.readFromParcel(obtain);
                return bundle2;
            }
            try {
                return h(mostSignificantBits);
            } catch (RemoteException e3) {
                throw new fka("Error fetching bundle for response", e3);
            }
        } catch (RemoteException e4) {
            throw new fka("Could not access other profile", e4);
        }
    }
}
