package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PG */
/* renamed from: fqb  reason: default package */
/* loaded from: classes.dex */
public final class fqb extends gdx implements fob, foc {
    private static final fgy h = gdt.a;
    public final Context a;
    public final Handler b;
    public final Set c;
    public final fqs d;
    public gdu e;
    public fpi f;
    public final fgy g;

    public fqb(Context context, Handler handler, fqs fqsVar) {
        fgy fgyVar = h;
        this.a = context;
        this.b = handler;
        this.d = fqsVar;
        this.c = fqsVar.b;
        this.g = fgyVar;
    }

    @Override // defpackage.fpb
    public final void a(int i) {
        this.e.l();
    }

    @Override // defpackage.fpb
    public final void b() {
        fqb fqbVar;
        GoogleSignInAccount googleSignInAccount;
        gdu gduVar = this.e;
        try {
            Account account = ((gea) gduVar).s.a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            try {
                if ("<<default account>>".equals(account.name)) {
                    try {
                        Context context = ((fqq) gduVar).a;
                        flg.a.lock();
                        if (flg.b == null) {
                            flg.b = new flg(context.getApplicationContext());
                        }
                        flg flgVar = flg.b;
                        flg.a.unlock();
                        String a = flgVar.a("defaultGoogleSignInAccount");
                        if (!TextUtils.isEmpty(a)) {
                            String a2 = flgVar.a("googleSignInAccount:" + a);
                            if (a2 != null) {
                                if (!TextUtils.isEmpty(a2)) {
                                    JSONObject jSONObject = new JSONObject(a2);
                                    String optString = jSONObject.optString("photoUrl");
                                    Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
                                    long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
                                    HashSet hashSet = new HashSet();
                                    JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
                                    int i = 0;
                                    for (int length = jSONArray.length(); i < length; length = length) {
                                        hashSet.add(new Scope(jSONArray.getString(i)));
                                        i++;
                                    }
                                    String optString2 = jSONObject.optString("id");
                                    String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
                                    String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
                                    String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
                                    String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
                                    String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
                                    Long valueOf = Long.valueOf(parseLong);
                                    String string = jSONObject.getString("obfuscatedIdentifier");
                                    long longValue = valueOf.longValue();
                                    fyb.aF(string);
                                    googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, longValue, string, new ArrayList(hashSet), optString6, optString7);
                                    googleSignInAccount.g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
                                    Integer num = ((gea) gduVar).t;
                                    fyb.ax(num);
                                    frq frqVar = new frq(2, account, num.intValue(), googleSignInAccount);
                                    gdy gdyVar = (gdy) ((fqq) gduVar).w();
                                    geb gebVar = new geb(1, frqVar);
                                    Parcel a3 = gdyVar.a();
                                    bkh.d(a3, gebVar);
                                    fqbVar = this;
                                    bkh.f(a3, fqbVar);
                                    gdyVar.hI(12, a3);
                                    return;
                                }
                            }
                        }
                    } catch (RemoteException e) {
                        e = e;
                        fqbVar = this;
                        Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
                        try {
                            fqbVar.c(new gec(1, new fmt(8, null), null));
                            return;
                        } catch (RemoteException unused) {
                            Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
                            return;
                        }
                    }
                }
                bkh.f(a3, fqbVar);
                gdyVar.hI(12, a3);
                return;
            } catch (RemoteException e2) {
                e = e2;
                Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
                fqbVar.c(new gec(1, new fmt(8, null), null));
                return;
            }
            googleSignInAccount = null;
            Integer num2 = ((gea) gduVar).t;
            fyb.ax(num2);
            frq frqVar2 = new frq(2, account, num2.intValue(), googleSignInAccount);
            gdy gdyVar2 = (gdy) ((fqq) gduVar).w();
            geb gebVar2 = new geb(1, frqVar2);
            Parcel a32 = gdyVar2.a();
            bkh.d(a32, gebVar2);
            fqbVar = this;
        } catch (RemoteException e3) {
            e = e3;
            fqbVar = this;
        }
    }

    @Override // defpackage.gdx
    public final void c(gec gecVar) {
        this.b.post(new fso(this, gecVar, 1));
    }

    @Override // defpackage.fpw
    public final void i(fmt fmtVar) {
        this.f.b(fmtVar);
    }
}
