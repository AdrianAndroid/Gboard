package defpackage;

import android.accounts.Account;
import android.content.ContentProviderClient;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;

/* compiled from: PG */
/* renamed from: byq  reason: default package */
/* loaded from: classes.dex */
public final class byq {
    private static final Account[] a = new Account[0];

    public static Account[] a(Context context) {
        try {
            fyb.aF("com.google");
            try {
                int i = fmy.c;
                fnn.d(context, 8400000);
                fyb.ax(context);
                ContentProviderClient acquireContentProviderClient = context.getContentResolver().acquireContentProviderClient("com.google.android.gms.auth.accounts");
                if (acquireContentProviderClient == null) {
                    throw new RemoteException("The com.google.android.gms.auth.accounts provider is not available.");
                }
                try {
                    try {
                        Bundle call = acquireContentProviderClient.call("get_accounts", "com.google", new Bundle());
                        if (call == null) {
                            throw new RemoteException("Null result from AccountChimeraContentProvider");
                        }
                        Parcelable[] parcelableArray = call.getParcelableArray("accounts");
                        if (parcelableArray == null) {
                            throw new RemoteException("Key_Accounts is Null");
                        }
                        Account[] accountArr = new Account[parcelableArray.length];
                        for (int i2 = 0; i2 < parcelableArray.length; i2++) {
                            accountArr[i2] = (Account) parcelableArray[i2];
                        }
                        return accountArr;
                    } finally {
                        acquireContentProviderClient.release();
                    }
                } catch (RemoteException e) {
                    fkw.d.p("RemoteException when fetching accounts", e, new Object[0]);
                    throw e;
                } catch (Exception e2) {
                    fkw.d.p("Exception when getting accounts", e2, new Object[0]);
                    String message = e2.getMessage();
                    throw new RemoteException("Accounts ContentProvider failed: " + message);
                }
            } catch (GooglePlayServicesIncorrectManifestValueException unused) {
                throw new fnl();
            }
        } catch (RemoteException unused2) {
            return a;
        } catch (fnl unused3) {
            return a;
        } catch (fnm unused4) {
            return a;
        }
    }
}
