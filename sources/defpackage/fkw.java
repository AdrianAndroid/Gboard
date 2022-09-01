package defpackage;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: fkw  reason: default package */
/* loaded from: classes.dex */
public final class fkw {
    public static final String b = "androidPackageName";
    public static final String[] a = {"com.google", "com.google.work", "cn.google"};
    public static final ComponentName c = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    public static final ijk d = fhr.B("GoogleAuthUtil");

    public static TokenData a(Bundle bundle) {
        TokenData tokenData;
        fli[] values;
        ClassLoader classLoader = TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 == null) {
            tokenData = null;
        } else {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            tokenData = (TokenData) bundle2.getParcelable("TokenData");
        }
        if (tokenData != null) {
            return tokenData;
        }
        String string = bundle.getString("Error");
        fyb.ax(string);
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        fli fliVar = fli.UNKNOWN;
        for (fli fliVar2 : fli.values()) {
            if (true == fliVar2.ai.equals(string)) {
                fliVar = fliVar2;
            }
        }
        if (fli.BAD_AUTHENTICATION.equals(fliVar) || fli.CAPTCHA.equals(fliVar) || fli.NEED_PERMISSION.equals(fliVar) || fli.NEED_REMOTE_CONSENT.equals(fliVar) || fli.NEEDS_BROWSER.equals(fliVar) || fli.USER_CANCEL.equals(fliVar) || fli.DEVICE_MANAGEMENT_REQUIRED.equals(fliVar) || fli.DM_INTERNAL_ERROR.equals(fliVar) || fli.DM_SYNC_DISABLED.equals(fliVar) || fli.DM_ADMIN_BLOCKED.equals(fliVar) || fli.DM_ADMIN_PENDING_APPROVAL.equals(fliVar) || fli.DM_STALE_SYNC_REQUIRED.equals(fliVar) || fli.DM_DEACTIVATED.equals(fliVar) || fli.DM_REQUIRED.equals(fliVar) || fli.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(fliVar) || fli.DM_SCREENLOCK_REQUIRED.equals(fliVar)) {
            d.q("isUserRecoverableError status: ".concat(String.valueOf(String.valueOf(fliVar))), new Object[0]);
            throw new UserRecoverableAuthException(string);
        } else if (fli.NETWORK_ERROR.equals(fliVar) || fli.SERVICE_UNAVAILABLE.equals(fliVar) || fli.INTNERNAL_ERROR.equals(fliVar) || fli.AUTH_SECURITY_ERROR.equals(fliVar) || fli.ACCOUNT_NOT_PRESENT.equals(fliVar)) {
            throw new IOException(string);
        } else {
            throw new fkr(string);
        }
    }

    public static Object b(gen genVar, String str) {
        try {
            fyb.aB();
            if (genVar.d()) {
                return gni.g(genVar);
            }
            ges gesVar = new ges();
            gni.h(genVar, gesVar);
            gesVar.a.await();
            return gni.g(genVar);
        } catch (InterruptedException e) {
            String format = String.format("Interrupted while waiting for the task of %s to finish.", str);
            d.q(format, new Object[0]);
            throw new IOException(format, e);
        } catch (CancellationException e2) {
            String format2 = String.format("Canceled while waiting for the task of %s to finish.", str);
            d.q(format2, new Object[0]);
            throw new IOException(format2, e2);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof fnx) {
                throw ((fnx) cause);
            }
            String format3 = String.format("Unable to get a result for %s due to ExecutionException.", str);
            d.q(format3, new Object[0]);
            throw new IOException(format3, e3);
        }
    }

    public static void c(fnx fnxVar, String str) {
        d.q("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", str, Log.getStackTraceString(fnxVar));
    }

    public static void d(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        String str2 = b;
        if (TextUtils.isEmpty(bundle.getString(str2))) {
            bundle.putString(str2, str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }

    public static boolean e(Context context) {
        if (fmx.a.f(context, 17895000) != 0) {
            return false;
        }
        nga<String> ngaVar = npi.a.a().a().a;
        String str = context.getApplicationInfo().packageName;
        for (String str2 : ngaVar) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }

    public static Object f(Context context, ComponentName componentName, fkv fkvVar) {
        fms fmsVar = new fms();
        frc a2 = frc.a(context);
        try {
            try {
                if (a2.d(new frb(componentName), fmsVar)) {
                    try {
                        fyb.aC("BlockingServiceConnection.getService() called on main thread");
                        if (!fmsVar.a) {
                            fmsVar.a = true;
                            return fkvVar.a((IBinder) fmsVar.b.take());
                        }
                        throw new IllegalStateException("Cannot call get on this connection more than once");
                    } catch (RemoteException | InterruptedException | TimeoutException e) {
                        Log.i("GoogleAuthUtil", "Error on service connection.", e);
                        throw new IOException("Error on service connection.", e);
                    }
                }
                throw new IOException("Could not bind to service.");
            } finally {
                a2.b(componentName, fmsVar);
            }
        } catch (SecurityException e2) {
            Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", e2.getMessage()));
            throw new IOException("SecurityException while binding to Auth service.", e2);
        }
    }

    public static void g(Context context) {
        try {
            fnn.d(context.getApplicationContext(), 8400000);
        } catch (GooglePlayServicesIncorrectManifestValueException e) {
            e = e;
            throw new fkr(e.getMessage(), e);
        } catch (fnl e2) {
            e = e2;
            throw new fkr(e.getMessage(), e);
        } catch (fnm e3) {
            String message = e3.getMessage();
            new Intent(e3.a);
            throw new fkx(message);
        }
    }

    public static void h(Object obj) {
        if (obj != null) {
            return;
        }
        d.q("Service call returned null.", new Object[0]);
        throw new IOException("Service unavailable.");
    }

    public static Account[] i(Context context, final String[] strArr) {
        fyb.ax(context);
        fyb.aF("com.google");
        g(context);
        kju.f(context);
        if (npi.a.a().b() && e(context)) {
            fky n = fhr.n(context);
            fkq fkqVar = new fkq("com.google", strArr);
            fqf b2 = fqg.b();
            b2.b = new fmv[]{fkp.b};
            b2.a = new flc(fkqVar, 2);
            b2.c = 1516;
            try {
                List list = (List) b(((fnz) n).h(b2.a()), "Accounts retrieval");
                h(list);
                return (Account[]) list.toArray(new Account[0]);
            } catch (fnx e) {
                c(e, "Accounts retrieval");
            }
        }
        return (Account[]) f(context, c, new fkv() { // from class: fks
            public final /* synthetic */ String a = "com.google";

            @Override // defpackage.fkv
            public final Object a(IBinder iBinder) {
                fjc fjcVar;
                Parcelable[] parcelableArray;
                String str = this.a;
                String[] strArr2 = strArr;
                String[] strArr3 = fkw.a;
                if (iBinder == null) {
                    fjcVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
                    if (queryLocalInterface instanceof fjc) {
                        fjcVar = (fjc) queryLocalInterface;
                    } else {
                        fjcVar = new fjc(iBinder);
                    }
                }
                Bundle bundle = new Bundle();
                bundle.putString("accountType", str);
                bundle.putStringArray("account_features", strArr2);
                Parcel a2 = fjcVar.a();
                bkh.d(a2, bundle);
                Parcel hG = fjcVar.hG(6, a2);
                Bundle bundle2 = (Bundle) bkh.a(hG, Bundle.CREATOR);
                hG.recycle();
                if (bundle2 == null || (parcelableArray = bundle2.getParcelableArray("accounts")) == null) {
                    throw new IOException("Receive null result from service call.");
                }
                Account[] accountArr = new Account[parcelableArray.length];
                for (int i = 0; i < parcelableArray.length; i++) {
                    accountArr[i] = (Account) parcelableArray[i];
                }
                return accountArr;
            }
        });
    }
}
