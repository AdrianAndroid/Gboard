package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: bdo  reason: default package */
/* loaded from: classes.dex */
public final class bdo implements Handler.Callback {
    private static final bdn f = new bdm(0);
    public final bdh e;
    private volatile atw g;
    private final Handler h;
    private final bdn i;
    final Map a = new HashMap();
    final Map b = new HashMap();
    public final qo c = new qo();
    public final qo d = new qo();
    private final Bundle j = new Bundle();

    public bdo(bdn bdnVar, aqr aqrVar, byte[] bArr) {
        bdh bdcVar;
        this.i = bdnVar == null ? f : bdnVar;
        this.h = new Handler(Looper.getMainLooper(), this);
        if (!bbk.b || !bbk.a) {
            bdcVar = new bdc();
        } else if (aqrVar.a(atf.class)) {
            bdcVar = new bde();
        } else {
            bdcVar = new bdg();
        }
        this.e = bdcVar;
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return a(((ContextWrapper) context).getBaseContext());
    }

    public static void j(Collection collection, Map map) {
        View view;
        if (collection == null) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            an anVar = (an) it.next();
            if (anVar != null && (view = anVar.O) != null) {
                map.put(view, anVar);
                j(anVar.D().j(), map);
            }
        }
    }

    private static void k(Activity activity) {
        if (!activity.isDestroyed()) {
            return;
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    private static boolean l(Context context) {
        Activity a = a(context);
        return a == null || !a.isFinishing();
    }

    @Deprecated
    public final atw b(Context context, FragmentManager fragmentManager, Fragment fragment, boolean z) {
        bdl g = g(fragmentManager, fragment);
        atw atwVar = g.c;
        if (atwVar == null) {
            atwVar = this.i.a(atb.b(context), g.a, g.b, context);
            if (z) {
                atwVar.n();
            }
            g.c = atwVar;
        }
        return atwVar;
    }

    public final atw c(Activity activity) {
        if (bgj.n()) {
            return d(activity.getApplicationContext());
        }
        if (activity instanceof ap) {
            return e((ap) activity);
        }
        k(activity);
        this.e.a(activity);
        return b(activity, activity.getFragmentManager(), null, l(activity));
    }

    public final atw e(ap apVar) {
        if (bgj.n()) {
            return d(apVar.getApplicationContext());
        }
        k(apVar);
        this.e.a(apVar);
        return f(apVar, apVar.hB(), null, l(apVar));
    }

    public final atw f(Context context, bi biVar, an anVar, boolean z) {
        beb h = h(biVar, anVar);
        atw atwVar = h.c;
        if (atwVar == null) {
            atwVar = this.i.a(atb.b(context), h.a, h.b, context);
            if (z) {
                atwVar.n();
            }
            h.c = atwVar;
        }
        return atwVar;
    }

    public final bdl g(FragmentManager fragmentManager, Fragment fragment) {
        bdl bdlVar = (bdl) this.a.get(fragmentManager);
        if (bdlVar == null) {
            bdl bdlVar2 = (bdl) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
            if (bdlVar2 != null) {
                return bdlVar2;
            }
            bdl bdlVar3 = new bdl();
            bdlVar3.d = fragment;
            if (fragment != null && fragment.getActivity() != null) {
                bdlVar3.a(fragment.getActivity());
            }
            this.a.put(fragmentManager, bdlVar3);
            fragmentManager.beginTransaction().add(bdlVar3, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.h.obtainMessage(1, fragmentManager).sendToTarget();
            return bdlVar3;
        }
        return bdlVar;
    }

    public final beb h(bi biVar, an anVar) {
        bi a;
        beb bebVar = (beb) this.b.get(biVar);
        if (bebVar == null) {
            beb bebVar2 = (beb) biVar.e("com.bumptech.glide.manager");
            if (bebVar2 != null) {
                return bebVar2;
            }
            beb bebVar3 = new beb();
            bebVar3.d = anVar;
            if (anVar != null && anVar.fS() != null && (a = beb.a(anVar)) != null) {
                bebVar3.m(anVar.fS(), a);
            }
            this.b.put(biVar, bebVar3);
            bq i = biVar.i();
            i.o(bebVar3, "com.bumptech.glide.manager");
            i.k();
            this.h.obtainMessage(2, biVar).sendToTarget();
            return bebVar3;
        }
        return bebVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        FragmentManager fragmentManager;
        FragmentManager fragmentManager2;
        int i = message.arg1;
        int i2 = message.what;
        Object obj = null;
        boolean z = false;
        boolean z2 = true;
        if (i2 == 1) {
            FragmentManager fragmentManager3 = (FragmentManager) message.obj;
            bdl bdlVar = (bdl) this.a.get(fragmentManager3);
            bdl bdlVar2 = (bdl) fragmentManager3.findFragmentByTag("com.bumptech.glide.manager");
            if (bdlVar2 != bdlVar) {
                if (bdlVar2 != null && bdlVar2.c != null) {
                    throw new IllegalStateException("We've added two fragments with requests! Old: " + bdlVar2.toString() + " New: " + String.valueOf(bdlVar));
                } else if (i == 1 || fragmentManager3.isDestroyed()) {
                    if (Log.isLoggable("RMRetriever", 5)) {
                        if (fragmentManager3.isDestroyed()) {
                            Log.w("RMRetriever", "Parent was destroyed before our Fragment could be added");
                        } else {
                            Log.w("RMRetriever", "Tried adding Fragment twice and failed twice, giving up!");
                        }
                    }
                    bdlVar.a.b();
                } else {
                    FragmentTransaction add = fragmentManager3.beginTransaction().add(bdlVar, "com.bumptech.glide.manager");
                    if (bdlVar2 != null) {
                        add.remove(bdlVar2);
                    }
                    add.commitAllowingStateLoss();
                    this.h.obtainMessage(1, 1, 0, fragmentManager3).sendToTarget();
                    fragmentManager2 = null;
                }
            }
            obj = this.a.remove(fragmentManager3);
            fragmentManager = fragmentManager3;
            z = true;
            fragmentManager2 = fragmentManager;
        } else if (i2 != 2) {
            fragmentManager2 = null;
            z2 = false;
        } else {
            bi biVar = (bi) message.obj;
            beb bebVar = (beb) this.b.get(biVar);
            beb bebVar2 = (beb) biVar.e("com.bumptech.glide.manager");
            if (bebVar2 != bebVar) {
                if (bebVar2 != null && bebVar2.c != null) {
                    throw new IllegalStateException("We've added two fragments with requests! Old: " + bebVar2.toString() + " New: " + String.valueOf(bebVar));
                } else if (i == 1 || biVar.q) {
                    if (biVar.q) {
                        if (Log.isLoggable("RMRetriever", 5)) {
                            Log.w("RMRetriever", "Parent was destroyed before our Fragment could be added, all requests for the destroyed parent are cancelled");
                        }
                    } else if (Log.isLoggable("RMRetriever", 6)) {
                        Log.e("RMRetriever", "ERROR: Tried adding Fragment twice and failed twice, giving up and cancelling all associated requests! This probably means you're starting loads in a unit test with an Activity that you haven't created and never create. If you're using Robolectric, create the Activity as part of your test setup");
                    }
                    bebVar.a.b();
                } else {
                    bq i3 = biVar.i();
                    i3.o(bebVar, "com.bumptech.glide.manager");
                    if (bebVar2 != null) {
                        i3.m(bebVar2);
                    }
                    i3.e();
                    this.h.obtainMessage(2, 1, 0, biVar).sendToTarget();
                    fragmentManager2 = null;
                }
            }
            obj = this.b.remove(biVar);
            fragmentManager = biVar;
            z = true;
            fragmentManager2 = fragmentManager;
        }
        if (Log.isLoggable("RMRetriever", 5) && z && obj == null) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: ".concat(String.valueOf(String.valueOf(fragmentManager2))));
        }
        return z2;
    }

    public final atw d(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (bgj.o() && !(context instanceof Application)) {
            if (context instanceof ap) {
                return e((ap) context);
            }
            if (context instanceof Activity) {
                return c((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return d(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.g == null) {
            synchronized (this) {
                if (this.g == null) {
                    this.g = this.i.a(atb.b(context.getApplicationContext()), new bcy(), new bdd(), context.getApplicationContext());
                }
            }
        }
        return this.g;
    }

    @Deprecated
    public final void i(FragmentManager fragmentManager, qo qoVar) {
        Fragment fragment;
        if (Build.VERSION.SDK_INT >= 26) {
            for (Fragment fragment2 : fragmentManager.getFragments()) {
                if (fragment2.getView() != null) {
                    qoVar.put(fragment2.getView(), fragment2);
                    i(fragment2.getChildFragmentManager(), qoVar);
                }
            }
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            this.j.putInt("key", i);
            try {
                fragment = fragmentManager.getFragment(this.j, "key");
            } catch (Exception unused) {
                fragment = null;
            }
            if (fragment == null) {
                return;
            }
            if (fragment.getView() != null) {
                qoVar.put(fragment.getView(), fragment);
                i(fragment.getChildFragmentManager(), qoVar);
            }
            i = i2;
        }
    }
}
