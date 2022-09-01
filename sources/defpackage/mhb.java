package defpackage;

import android.content.Context;
import android.os.Process;
import android.os.health.HealthStats;
import android.util.JsonWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: mhb  reason: default package */
/* loaded from: classes.dex */
public final class mhb {
    public static nfh a(Throwable th) {
        StackTraceElement[] stackTraceElementArr;
        nfh t = mgw.e.t();
        nfh t2 = mgu.f.t();
        String name = th.getClass().getName();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mgu mguVar = (mgu) t2.b;
        name.getClass();
        mguVar.a |= 1;
        mguVar.b = name;
        if (th.getMessage() != null) {
            String message = th.getMessage();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mgu mguVar2 = (mgu) t2.b;
            message.getClass();
            mguVar2.a |= 2;
            mguVar2.c = message;
        }
        try {
            stackTraceElementArr = th.getStackTrace();
        } catch (NullPointerException unused) {
            stackTraceElementArr = null;
        }
        if (stackTraceElementArr != null) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                nfh t3 = mgt.f.t();
                if (stackTraceElement != null) {
                    String className = stackTraceElement.getClassName();
                    if (t3.c) {
                        t3.cD();
                        t3.c = false;
                    }
                    mgt mgtVar = (mgt) t3.b;
                    className.getClass();
                    mgtVar.a |= 1;
                    mgtVar.b = className;
                    String methodName = stackTraceElement.getMethodName();
                    if (t3.c) {
                        t3.cD();
                        t3.c = false;
                    }
                    mgt mgtVar2 = (mgt) t3.b;
                    methodName.getClass();
                    mgtVar2.a |= 2;
                    mgtVar2.c = methodName;
                    int lineNumber = stackTraceElement.getLineNumber();
                    if (t3.c) {
                        t3.cD();
                        t3.c = false;
                    }
                    mgt mgtVar3 = (mgt) t3.b;
                    mgtVar3.a |= 8;
                    mgtVar3.e = lineNumber;
                    if (stackTraceElement.getFileName() != null) {
                        String fileName = stackTraceElement.getFileName();
                        if (t3.c) {
                            t3.cD();
                            t3.c = false;
                        }
                        mgt mgtVar4 = (mgt) t3.b;
                        fileName.getClass();
                        mgtVar4.a |= 4;
                        mgtVar4.d = fileName;
                    }
                }
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                mgu mguVar3 = (mgu) t2.b;
                mgt mgtVar5 = (mgt) t3.cz();
                mgtVar5.getClass();
                nga ngaVar = mguVar3.e;
                if (!ngaVar.c()) {
                    mguVar3.e = nfm.H(ngaVar);
                }
                mguVar3.e.add(mgtVar5);
            }
        }
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mgw mgwVar = (mgw) t.b;
        mgu mguVar4 = (mgu) t2.cz();
        mguVar4.getClass();
        mgwVar.b = mguVar4;
        mgwVar.a |= 1;
        return t;
    }

    public static int b(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int c(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
            default:
                return 0;
            case 10:
                return 11;
            case 11:
                return 12;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return 13;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return 14;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            case 50:
                return 51;
            case 51:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 54:
                return 55;
        }
    }

    public static int d(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            if (i == 4) {
                return 5;
            }
            return i != 5 ? 0 : 6;
        }
        return 1;
    }

    public static int e(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 4 ? 0 : 5;
        }
        return 1;
    }

    public static int f(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            if (i == 4) {
                return 5;
            }
            return i != 5 ? 0 : 6;
        }
        return 1;
    }

    public static int g(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return 13;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return 14;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            default:
                return 0;
        }
    }

    public static int h(int i) {
        if (i != 0) {
            switch (i) {
                case 0:
                    return 1;
                case 262144:
                    return 262145;
                case 262145:
                    return 262146;
                case 262146:
                    return 262147;
                case 262147:
                    return 262148;
                case 262148:
                    return 262149;
                case 262149:
                    return 262150;
                case 262150:
                    return 262151;
                case 262151:
                    return 262152;
                case 262152:
                    return 262153;
                case 262153:
                    return 262154;
                case 262154:
                    return 262155;
                case 262155:
                    return 262156;
                case 262156:
                    return 262157;
                case 262157:
                    return 262158;
                case 262158:
                    return 262159;
                case 262159:
                    return 262160;
                case 262160:
                    return 262161;
                case 262161:
                    return 262162;
                case 262162:
                    return 262163;
                case 262163:
                    return 262164;
                case 262164:
                    return 262165;
                case 262165:
                    return 262166;
                case 262166:
                    return 262167;
                case 262167:
                    return 262168;
                case 262168:
                    return 262169;
                case 262169:
                    return 262170;
                case 262170:
                    return 262171;
                case 262171:
                    return 262172;
                case 262172:
                    return 262173;
                case 262173:
                    return 262174;
                case 262174:
                    return 262175;
                case 262175:
                    return 262176;
                case 262176:
                    return 262177;
                case 262177:
                    return 262178;
                case 262178:
                    return 262179;
                case 262179:
                    return 262180;
                case 262180:
                    return 262181;
                case 262181:
                    return 262182;
                case 262182:
                    return 262183;
                case 262183:
                    return 262184;
                case 262184:
                    return 262185;
                case 262185:
                    return 262186;
                case 262186:
                    return 262187;
                case 262187:
                    return 262188;
                case 262188:
                    return 262189;
                case 262189:
                    return 262190;
                case 262190:
                    return 262191;
                case 262191:
                    return 262192;
                case 262192:
                    return 262193;
                case 262193:
                    return 262194;
                case 262194:
                    return 262195;
                case 262195:
                    return 262196;
                case 262196:
                    return 262197;
                case 262197:
                    return 262198;
                case 262198:
                    return 262199;
                case 262199:
                    return 262200;
                case 262200:
                    return 262201;
                case 262201:
                    return 262202;
                case 262202:
                    return 262203;
                case 262203:
                    return 262204;
                case 262204:
                    return 262205;
                case 262205:
                    return 262206;
                case 262206:
                    return 262207;
                case 262207:
                    return 262208;
                case 262208:
                    return 262209;
                case 262209:
                    return 262210;
                case 262210:
                    return 262211;
                case 262211:
                    return 262212;
                case 262212:
                    return 262213;
                case 262213:
                    return 262214;
                case 262214:
                    return 262215;
                case 262215:
                    return 262216;
                case 262216:
                    return 262217;
                case 262217:
                    return 262218;
                case 262218:
                    return 262219;
                case 262219:
                    return 262220;
                case 262220:
                    return 262221;
                case 262221:
                    return 262222;
                case 262222:
                    return 262223;
                case 262223:
                    return 262224;
                case 262224:
                    return 262225;
                case 262225:
                    return 262226;
                case 262226:
                    return 262227;
                case 262227:
                    return 262228;
                case 262228:
                    return 262229;
                case 262229:
                    return 262230;
                case 262230:
                    return 262231;
                case 262231:
                    return 262232;
                case 262232:
                    return 262233;
                case 262233:
                    return 262234;
                case 262234:
                    return 262235;
                case 262235:
                    return 262236;
                case 262236:
                    return 262237;
                case 660000:
                    return 660001;
                case 660003:
                    return 660004;
                case 660007:
                    return 660008;
                case 660021:
                    return 660022;
                case 660105:
                    return 660106;
                case 660106:
                    return 660107;
                case 660107:
                    return 660108;
                case 660109:
                    return 660110;
                case 660111:
                    return 660112;
                case 660118:
                    return 660119;
                case 660130:
                    return 660131;
                case 660137:
                    return 660138;
                case 660200:
                    return 660201;
                case 660201:
                    return 660202;
                case 660202:
                    return 660203;
                case 660207:
                    return 660208;
                case 660324:
                    return 660325;
                case 660330:
                    return 660331;
                case 660337:
                    return 660338;
                case 660352:
                    return 660353;
                case 660356:
                    return 660357;
                case 662000:
                    return 662001;
                case 670000:
                    return 670001;
                case 670019:
                    return 670020;
                case 670025:
                    return 670026;
                case 670027:
                    return 670028;
                case 670051:
                    return 670052;
                case 672000:
                    return 672001;
                case 917504:
                    return 917505;
                case 917505:
                    return 917506;
                case 917506:
                    return 917507;
                case 917507:
                    return 917508;
                case 917508:
                    return 917509;
                case 917509:
                    return 917510;
                case 917510:
                    return 917511;
                case 917511:
                    return 917512;
                case 917512:
                    return 917513;
                case 1638400:
                    return 1638401;
                case 1638401:
                    return 1638402;
                case 1638402:
                    return 1638403;
                case 1638403:
                    return 1638404;
                case 1638404:
                    return 1638405;
                case 1638405:
                    return 1638406;
                case 1638406:
                    return 1638407;
                case 1638407:
                    return 1638408;
                case 1638408:
                    return 1638409;
                case 1638409:
                    return 1638410;
                case 1638410:
                    return 1638411;
                case 1638411:
                    return 1638412;
                case 1638412:
                    return 1638413;
                case 1638413:
                    return 1638414;
                case 1638414:
                    return 1638415;
                case 1638415:
                    return 1638416;
                case 1638416:
                    return 1638417;
                case 1638417:
                    return 1638418;
                case 1638418:
                    return 1638419;
                case 1638419:
                    return 1638420;
                case 2031646:
                    return 2031647;
                case 6563400:
                    return 6563401;
                case 6563401:
                    return 6563402;
                case 6563402:
                    return 6563403;
                case 6563403:
                    return 6563404;
                default:
                    switch (i) {
                        case 65536:
                            return 65537;
                        case 65537:
                            return 65538;
                        case 65538:
                            return 65539;
                        case 65539:
                            return 65540;
                        case 65540:
                            return 65541;
                        case 65541:
                            return 65542;
                        case 65542:
                            return 65543;
                        case 65543:
                            return 65544;
                        case 65544:
                            return 65545;
                        case 65545:
                            return 65546;
                        case 65546:
                            return 65547;
                        case 65547:
                            return 65548;
                        case 65548:
                            return 65549;
                        case 65549:
                            return 65550;
                        case 65550:
                            return 65551;
                        case 65551:
                            return 65552;
                        case 65552:
                            return 65553;
                        case 65553:
                            return 65554;
                        case 65554:
                            return 65555;
                        case 65555:
                            return 65556;
                        case 65556:
                            return 65557;
                        case 65557:
                            return 65558;
                        case 65558:
                            return 65559;
                        case 65559:
                            return 65560;
                        case 65560:
                            return 65561;
                        case 65561:
                            return 65562;
                        case 65562:
                            return 65563;
                        case 65563:
                            return 65564;
                        case 65564:
                            return 65565;
                        case 65565:
                            return 65566;
                        case 65566:
                            return 65567;
                        case 65567:
                            return 65568;
                        case 65568:
                            return 65569;
                        case 65569:
                            return 65570;
                        case 65570:
                            return 65571;
                        case 65571:
                            return 65572;
                        case 65572:
                            return 65573;
                        case 65573:
                            return 65574;
                        case 65574:
                            return 65575;
                        case 65575:
                            return 65576;
                        case 65576:
                            return 65577;
                        case 65577:
                            return 65578;
                        case 65578:
                            return 65579;
                        case 65579:
                            return 65580;
                        case 65580:
                            return 65581;
                        case 65581:
                            return 65582;
                        case 65582:
                            return 65583;
                        case 65583:
                            return 65584;
                        case 65584:
                            return 65585;
                        case 65585:
                            return 65586;
                        case 65586:
                            return 65587;
                        case 65587:
                            return 65588;
                        default:
                            switch (i) {
                                case 131072:
                                    return 131073;
                                case 131073:
                                    return 131074;
                                case 131074:
                                    return 131075;
                                case 131075:
                                    return 131076;
                                case 131076:
                                    return 131077;
                                case 131077:
                                    return 131078;
                                case 131078:
                                    return 131079;
                                case 131079:
                                    return 131080;
                                case 131080:
                                    return 131081;
                                case 131081:
                                    return 131082;
                                case 131082:
                                    return 131083;
                                case 131083:
                                    return 131084;
                                case 131084:
                                    return 131085;
                                case 131085:
                                    return 131086;
                                case 131086:
                                    return 131087;
                                case 131087:
                                    return 131088;
                                case 131088:
                                    return 131089;
                                case 131089:
                                    return 131090;
                                case 131090:
                                    return 131091;
                                case 131091:
                                    return 131092;
                                case 131092:
                                    return 131093;
                                case 131093:
                                    return 131094;
                                case 131094:
                                    return 131095;
                                default:
                                    switch (i) {
                                        case 327680:
                                            return 327681;
                                        case 327681:
                                            return 327682;
                                        case 327682:
                                            return 327683;
                                        case 327683:
                                            return 327684;
                                        case 327684:
                                            return 327685;
                                        case 327685:
                                            return 327686;
                                        case 327686:
                                            return 327687;
                                        case 327687:
                                            return 327688;
                                        case 327688:
                                            return 327689;
                                        case 327689:
                                            return 327690;
                                        case 327690:
                                            return 327691;
                                        case 327691:
                                            return 327692;
                                        case 327692:
                                            return 327693;
                                        case 327693:
                                            return 327694;
                                        case 327694:
                                            return 327695;
                                        case 327695:
                                            return 327696;
                                        case 327696:
                                            return 327697;
                                        case 327697:
                                            return 327698;
                                        case 327698:
                                            return 327699;
                                        case 327699:
                                            return 327700;
                                        case 327700:
                                            return 327701;
                                        case 327701:
                                            return 327702;
                                        case 327702:
                                            return 327703;
                                        case 327703:
                                            return 327704;
                                        case 327704:
                                            return 327705;
                                        case 327705:
                                            return 327706;
                                        case 327706:
                                            return 327707;
                                        case 327707:
                                            return 327708;
                                        case 327708:
                                            return 327709;
                                        case 327709:
                                            return 327710;
                                        case 327710:
                                            return 327711;
                                        case 327711:
                                            return 327712;
                                        case 327712:
                                            return 327713;
                                        case 327713:
                                            return 327714;
                                        case 327714:
                                            return 327715;
                                        case 327715:
                                            return 327716;
                                        case 327716:
                                            return 327717;
                                        case 327717:
                                            return 327718;
                                        case 327718:
                                            return 327719;
                                        case 327719:
                                            return 327720;
                                        case 327720:
                                            return 327721;
                                        case 327721:
                                            return 327722;
                                        case 327722:
                                            return 327723;
                                        case 327723:
                                            return 327724;
                                        case 327724:
                                            return 327725;
                                        case 327725:
                                            return 327726;
                                        case 327726:
                                            return 327727;
                                        case 327727:
                                            return 327728;
                                        default:
                                            switch (i) {
                                                case 393216:
                                                    return 393217;
                                                case 393217:
                                                    return 393218;
                                                case 393218:
                                                    return 393219;
                                                case 393219:
                                                    return 393220;
                                                case 393220:
                                                    return 393221;
                                                case 393221:
                                                    return 393222;
                                                case 393222:
                                                    return 393223;
                                                case 393223:
                                                    return 393224;
                                                case 393224:
                                                    return 393225;
                                                case 393225:
                                                    return 393226;
                                                case 393226:
                                                    return 393227;
                                                case 393227:
                                                    return 393228;
                                                case 393228:
                                                    return 393229;
                                                case 393229:
                                                    return 393230;
                                                case 393230:
                                                    return 393231;
                                                case 393231:
                                                    return 393232;
                                                case 393232:
                                                    return 393233;
                                                case 393233:
                                                    return 393234;
                                                case 393234:
                                                    return 393235;
                                                case 393235:
                                                    return 393236;
                                                case 393236:
                                                    return 393237;
                                                case 393237:
                                                    return 393238;
                                                case 393238:
                                                    return 393239;
                                                case 393239:
                                                    return 393240;
                                                case 393240:
                                                    return 393241;
                                                case 393241:
                                                    return 393242;
                                                case 393242:
                                                    return 393243;
                                                case 393243:
                                                    return 393244;
                                                case 393244:
                                                    return 393245;
                                                case 393245:
                                                    return 393246;
                                                case 393246:
                                                    return 393247;
                                                case 393247:
                                                    return 393248;
                                                case 393248:
                                                    return 393249;
                                                case 393249:
                                                    return 393250;
                                                case 393250:
                                                    return 393251;
                                                case 393251:
                                                    return 393252;
                                                case 393252:
                                                    return 393253;
                                                case 393253:
                                                    return 393254;
                                                case 393254:
                                                    return 393255;
                                                case 393255:
                                                    return 393256;
                                                case 393256:
                                                    return 393257;
                                                case 393257:
                                                    return 393258;
                                                case 393258:
                                                    return 393259;
                                                case 393259:
                                                    return 393260;
                                                case 393260:
                                                    return 393261;
                                                case 393261:
                                                    return 393262;
                                                case 393262:
                                                    return 393263;
                                                case 393263:
                                                    return 393264;
                                                case 393264:
                                                    return 393265;
                                                case 393265:
                                                    return 393266;
                                                case 393266:
                                                    return 393267;
                                                case 393267:
                                                    return 393268;
                                                case 393268:
                                                    return 393269;
                                                case 393269:
                                                    return 393270;
                                                case 393270:
                                                    return 393271;
                                                case 393271:
                                                    return 393272;
                                                case 393272:
                                                    return 393273;
                                                case 393273:
                                                    return 393274;
                                                case 393274:
                                                    return 393275;
                                                default:
                                                    switch (i) {
                                                        case 458752:
                                                            return 458753;
                                                        case 458753:
                                                            return 458754;
                                                        case 458754:
                                                            return 458755;
                                                        case 458755:
                                                            return 458756;
                                                        case 458756:
                                                            return 458757;
                                                        case 458757:
                                                            return 458758;
                                                        case 458758:
                                                            return 458759;
                                                        case 458759:
                                                            return 458760;
                                                        case 458760:
                                                            return 458761;
                                                        case 458761:
                                                            return 458762;
                                                        default:
                                                            switch (i) {
                                                                case 524288:
                                                                    return 524289;
                                                                case 524289:
                                                                    return 524290;
                                                                case 524290:
                                                                    return 524291;
                                                                case 524291:
                                                                    return 524292;
                                                                case 524292:
                                                                    return 524293;
                                                                case 524293:
                                                                    return 524294;
                                                                case 524294:
                                                                    return 524295;
                                                                case 524295:
                                                                    return 524296;
                                                                case 524296:
                                                                    return 524297;
                                                                case 524297:
                                                                    return 524298;
                                                                case 524298:
                                                                    return 524299;
                                                                case 524299:
                                                                    return 524300;
                                                                case 524300:
                                                                    return 524301;
                                                                case 524301:
                                                                    return 524302;
                                                                case 524302:
                                                                    return 524303;
                                                                case 524303:
                                                                    return 524304;
                                                                case 524304:
                                                                    return 524305;
                                                                case 524305:
                                                                    return 524306;
                                                                default:
                                                                    switch (i) {
                                                                        case 655360:
                                                                            return 655361;
                                                                        case 655361:
                                                                            return 655362;
                                                                        case 655362:
                                                                            return 655363;
                                                                        case 655363:
                                                                            return 655364;
                                                                        case 655364:
                                                                            return 655365;
                                                                        case 655365:
                                                                            return 655366;
                                                                        case 655366:
                                                                            return 655367;
                                                                        case 655367:
                                                                            return 655368;
                                                                        case 655368:
                                                                            return 655369;
                                                                        case 655369:
                                                                            return 655370;
                                                                        case 655370:
                                                                            return 655371;
                                                                        case 655371:
                                                                            return 655372;
                                                                        case 655372:
                                                                            return 655373;
                                                                        case 655373:
                                                                            return 655374;
                                                                        case 655374:
                                                                            return 655375;
                                                                        case 655375:
                                                                            return 655376;
                                                                        case 655376:
                                                                            return 655377;
                                                                        case 655377:
                                                                            return 655378;
                                                                        case 655378:
                                                                            return 655379;
                                                                        case 655379:
                                                                            return 655380;
                                                                        default:
                                                                            switch (i) {
                                                                                case 656384:
                                                                                    return 656385;
                                                                                case 656385:
                                                                                    return 656386;
                                                                                case 656386:
                                                                                    return 656387;
                                                                                case 656387:
                                                                                    return 656388;
                                                                                case 656388:
                                                                                    return 656389;
                                                                                case 656389:
                                                                                    return 656390;
                                                                                case 656390:
                                                                                    return 656391;
                                                                                case 656391:
                                                                                    return 656392;
                                                                                case 656392:
                                                                                    return 656393;
                                                                                case 656393:
                                                                                    return 656394;
                                                                                case 656394:
                                                                                    return 656395;
                                                                                case 656395:
                                                                                    return 656396;
                                                                                case 656396:
                                                                                    return 656397;
                                                                                case 656397:
                                                                                    return 656398;
                                                                                case 656398:
                                                                                    return 656399;
                                                                                case 656399:
                                                                                    return 656400;
                                                                                default:
                                                                                    switch (i) {
                                                                                        case 660100:
                                                                                            return 660101;
                                                                                        case 660101:
                                                                                            return 660102;
                                                                                        case 660102:
                                                                                            return 660103;
                                                                                        case 660103:
                                                                                            return 660104;
                                                                                        default:
                                                                                            return 0;
                                                                                    }
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }
        return 1;
    }

    public static final kdf i(Long l, Long l2, HealthStats healthStats, onb onbVar, kcq kcqVar) {
        Object obj = kcqVar.a;
        nfh t = onl.an.t();
        long d = kcu.d(healthStats, 10001);
        long j = 0;
        if (d != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar = (onl) t.b;
            onlVar.a |= 1;
            onlVar.c = d;
        }
        long d2 = kcu.d(healthStats, 10002);
        if (d2 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar2 = (onl) t.b;
            onlVar2.a |= 2;
            onlVar2.d = d2;
        }
        long d3 = kcu.d(healthStats, 10003);
        if (d3 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar3 = (onl) t.b;
            onlVar3.a |= 4;
            onlVar3.e = d3;
        }
        long d4 = kcu.d(healthStats, 10004);
        if (d4 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar4 = (onl) t.b;
            onlVar4.a |= 8;
            onlVar4.f = d4;
        }
        t.ex(kcu.e(healthStats, 10005));
        t.ey(kcu.e(healthStats, 10006));
        t.ez(kcu.e(healthStats, 10007));
        t.ew(kcu.e(healthStats, 10008));
        t.ev(kcu.e(healthStats, 10009));
        t.er(kcu.e(healthStats, 10010));
        onk h = kcu.h(healthStats, 10011);
        if (h != null) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar5 = (onl) t.b;
            onlVar5.m = h;
            onlVar5.a |= 16;
        }
        t.es(kcu.e(healthStats, 10012));
        t.eu(kdb.a.d(kcu.f(healthStats, 10014)));
        t.et(kda.a.d(kcu.f(healthStats, 10015)));
        long d5 = kcu.d(healthStats, 10016);
        if (d5 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar6 = (onl) t.b;
            onlVar6.a |= 32;
            onlVar6.r = d5;
        }
        long d6 = kcu.d(healthStats, 10017);
        if (d6 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar7 = (onl) t.b;
            onlVar7.a |= 64;
            onlVar7.s = d6;
        }
        long d7 = kcu.d(healthStats, 10018);
        if (d7 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar8 = (onl) t.b;
            onlVar8.a |= 128;
            onlVar8.t = d7;
        }
        long d8 = kcu.d(healthStats, 10019);
        if (d8 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar9 = (onl) t.b;
            onlVar9.a |= 256;
            onlVar9.u = d8;
        }
        long d9 = kcu.d(healthStats, 10020);
        if (d9 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar10 = (onl) t.b;
            onlVar10.a |= 512;
            onlVar10.v = d9;
        }
        long d10 = kcu.d(healthStats, 10021);
        if (d10 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar11 = (onl) t.b;
            onlVar11.a |= 1024;
            onlVar11.w = d10;
        }
        long d11 = kcu.d(healthStats, 10022);
        if (d11 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar12 = (onl) t.b;
            onlVar12.a |= 2048;
            onlVar12.x = d11;
        }
        long d12 = kcu.d(healthStats, 10023);
        if (d12 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar13 = (onl) t.b;
            onlVar13.a |= 4096;
            onlVar13.y = d12;
        }
        long d13 = kcu.d(healthStats, 10024);
        if (d13 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar14 = (onl) t.b;
            onlVar14.a |= 8192;
            onlVar14.z = d13;
        }
        long d14 = kcu.d(healthStats, 10025);
        if (d14 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar15 = (onl) t.b;
            onlVar15.a |= 16384;
            onlVar15.A = d14;
        }
        long d15 = kcu.d(healthStats, 10026);
        if (d15 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar16 = (onl) t.b;
            onlVar16.a |= 32768;
            onlVar16.B = d15;
        }
        long d16 = kcu.d(healthStats, 10027);
        if (d16 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar17 = (onl) t.b;
            onlVar17.a |= 65536;
            onlVar17.C = d16;
        }
        long d17 = kcu.d(healthStats, 10028);
        if (d17 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar18 = (onl) t.b;
            onlVar18.a |= 131072;
            onlVar18.D = d17;
        }
        long d18 = kcu.d(healthStats, 10029);
        if (d18 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar19 = (onl) t.b;
            onlVar19.a |= 262144;
            onlVar19.E = d18;
        }
        onk h2 = kcu.h(healthStats, 10030);
        if (h2 != null) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar20 = (onl) t.b;
            onlVar20.F = h2;
            onlVar20.a |= 524288;
        }
        long d19 = kcu.d(healthStats, 10031);
        if (d19 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar21 = (onl) t.b;
            onlVar21.a |= 1048576;
            onlVar21.G = d19;
        }
        onk h3 = kcu.h(healthStats, 10032);
        if (h3 != null) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar22 = (onl) t.b;
            onlVar22.H = h3;
            onlVar22.a |= 2097152;
        }
        onk h4 = kcu.h(healthStats, 10033);
        if (h4 != null) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar23 = (onl) t.b;
            onlVar23.I = h4;
            onlVar23.a |= 4194304;
        }
        onk h5 = kcu.h(healthStats, 10034);
        if (h5 != null) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar24 = (onl) t.b;
            onlVar24.J = h5;
            onlVar24.a |= 8388608;
        }
        onk h6 = kcu.h(healthStats, 10035);
        if (h6 != null) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar25 = (onl) t.b;
            onlVar25.K = h6;
            onlVar25.a |= 16777216;
        }
        onk h7 = kcu.h(healthStats, 10036);
        if (h7 != null) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar26 = (onl) t.b;
            onlVar26.L = h7;
            onlVar26.a |= 33554432;
        }
        onk h8 = kcu.h(healthStats, 10037);
        if (h8 != null) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar27 = (onl) t.b;
            onlVar27.M = h8;
            onlVar27.a |= 67108864;
        }
        onk h9 = kcu.h(healthStats, 10038);
        if (h9 != null) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar28 = (onl) t.b;
            onlVar28.N = h9;
            onlVar28.a |= 134217728;
        }
        onk h10 = kcu.h(healthStats, 10039);
        if (h10 != null) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar29 = (onl) t.b;
            onlVar29.O = h10;
            onlVar29.a |= 268435456;
        }
        onk h11 = kcu.h(healthStats, 10040);
        if (h11 != null) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar30 = (onl) t.b;
            onlVar30.P = h11;
            onlVar30.a |= 536870912;
        }
        onk h12 = kcu.h(healthStats, 10041);
        if (h12 != null) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar31 = (onl) t.b;
            onlVar31.Q = h12;
            onlVar31.a |= 1073741824;
        }
        onk h13 = kcu.h(healthStats, 10042);
        if (h13 != null) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar32 = (onl) t.b;
            onlVar32.R = h13;
            onlVar32.a |= Integer.MIN_VALUE;
        }
        onk h14 = kcu.h(healthStats, 10043);
        if (h14 != null) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar33 = (onl) t.b;
            onlVar33.S = h14;
            onlVar33.b |= 1;
        }
        onk h15 = kcu.h(healthStats, 10044);
        if (h15 != null) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar34 = (onl) t.b;
            onlVar34.T = h15;
            onlVar34.b |= 2;
        }
        long d20 = kcu.d(healthStats, 10045);
        if (d20 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar35 = (onl) t.b;
            onlVar35.b |= 4;
            onlVar35.U = d20;
        }
        long d21 = kcu.d(healthStats, 10046);
        if (d21 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar36 = (onl) t.b;
            onlVar36.b |= 8;
            onlVar36.V = d21;
        }
        long d22 = kcu.d(healthStats, 10047);
        if (d22 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar37 = (onl) t.b;
            onlVar37.b |= 16;
            onlVar37.W = d22;
        }
        long d23 = kcu.d(healthStats, 10048);
        if (d23 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar38 = (onl) t.b;
            onlVar38.b |= 32;
            onlVar38.X = d23;
        }
        long d24 = kcu.d(healthStats, 10049);
        if (d24 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar39 = (onl) t.b;
            onlVar39.b |= 64;
            onlVar39.Y = d24;
        }
        long d25 = kcu.d(healthStats, 10050);
        if (d25 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar40 = (onl) t.b;
            onlVar40.b |= 128;
            onlVar40.Z = d25;
        }
        long d26 = kcu.d(healthStats, 10051);
        if (d26 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar41 = (onl) t.b;
            onlVar41.b |= 256;
            onlVar41.aa = d26;
        }
        long d27 = kcu.d(healthStats, 10052);
        if (d27 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar42 = (onl) t.b;
            onlVar42.b |= 512;
            onlVar42.ab = d27;
        }
        long d28 = kcu.d(healthStats, 10053);
        if (d28 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar43 = (onl) t.b;
            onlVar43.b |= 1024;
            onlVar43.ac = d28;
        }
        long d29 = kcu.d(healthStats, 10054);
        if (d29 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar44 = (onl) t.b;
            onlVar44.b |= 2048;
            onlVar44.ad = d29;
        }
        long d30 = kcu.d(healthStats, 10055);
        if (d30 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar45 = (onl) t.b;
            onlVar45.b |= 4096;
            onlVar45.ae = d30;
        }
        long d31 = kcu.d(healthStats, 10056);
        if (d31 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar46 = (onl) t.b;
            onlVar46.b |= 8192;
            onlVar46.af = d31;
        }
        long d32 = kcu.d(healthStats, 10057);
        if (d32 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar47 = (onl) t.b;
            onlVar47.b |= 16384;
            onlVar47.ag = d32;
        }
        long d33 = kcu.d(healthStats, 10058);
        if (d33 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar48 = (onl) t.b;
            onlVar48.b = 32768 | onlVar48.b;
            onlVar48.ah = d33;
        }
        long d34 = kcu.d(healthStats, 10059);
        if (d34 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar49 = (onl) t.b;
            onlVar49.b |= 65536;
            onlVar49.ai = d34;
        }
        onk h16 = kcu.h(healthStats, 10061);
        if (h16 != null) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar50 = (onl) t.b;
            onlVar50.aj = h16;
            onlVar50.b |= 131072;
        }
        long d35 = kcu.d(healthStats, 10062);
        if (d35 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar51 = (onl) t.b;
            onlVar51.b = 262144 | onlVar51.b;
            onlVar51.ak = d35;
        }
        long d36 = kcu.d(healthStats, 10063);
        if (d36 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar52 = (onl) t.b;
            onlVar52.b |= 524288;
            onlVar52.al = d36;
        }
        long d37 = kcu.d(healthStats, 10064);
        if (d37 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            onl onlVar53 = (onl) t.b;
            onlVar53.b |= 1048576;
            onlVar53.am = d37;
        }
        onl onlVar54 = (onl) t.cz();
        nfh nfhVar = (nfh) onlVar54.N(5);
        nfhVar.cG(onlVar54);
        Object obj2 = ((jma) obj).b;
        Collections.unmodifiableList(((onl) nfhVar.b).g);
        for (int i = 0; i < ((onl) nfhVar.b).g.size(); i++) {
            nfhVar.eJ(i, ((kcy) obj2).c(1, nfhVar.ek(i)));
        }
        Collections.unmodifiableList(((onl) nfhVar.b).h);
        for (int i2 = 0; i2 < ((onl) nfhVar.b).h.size(); i2++) {
            nfhVar.eK(i2, ((kcy) obj2).c(1, nfhVar.el(i2)));
        }
        Collections.unmodifiableList(((onl) nfhVar.b).i);
        for (int i3 = 0; i3 < ((onl) nfhVar.b).i.size(); i3++) {
            nfhVar.eL(i3, ((kcy) obj2).c(1, nfhVar.em(i3)));
        }
        Collections.unmodifiableList(((onl) nfhVar.b).j);
        for (int i4 = 0; i4 < ((onl) nfhVar.b).j.size(); i4++) {
            nfhVar.eI(i4, ((kcy) obj2).c(1, nfhVar.en(i4)));
        }
        Collections.unmodifiableList(((onl) nfhVar.b).k);
        for (int i5 = 0; i5 < ((onl) nfhVar.b).k.size(); i5++) {
            nfhVar.eF(i5, ((kcy) obj2).c(2, nfhVar.eo(i5)));
        }
        Collections.unmodifiableList(((onl) nfhVar.b).l);
        for (int i6 = 0; i6 < ((onl) nfhVar.b).l.size(); i6++) {
            nfhVar.eC(i6, ((kcy) obj2).c(3, nfhVar.ep(i6)));
        }
        Collections.unmodifiableList(((onl) nfhVar.b).n);
        for (int i7 = 0; i7 < ((onl) nfhVar.b).n.size(); i7++) {
            nfhVar.eE(i7, ((kcy) obj2).c(5, nfhVar.eq(i7)));
        }
        onl onlVar55 = (onl) nfhVar.cz();
        Object obj3 = kcqVar.b;
        if (obj3 != null) {
            j = ((String) obj3).hashCode();
        }
        return new kdf(onlVar55, l, l2, 462718519L, Long.valueOf(j), onbVar, null, null);
    }

    public static oob j(Context context) {
        nfh t = oob.e.t();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        oob oobVar = (oob) t.b;
        oobVar.a |= 1;
        oobVar.b = elapsedCpuTime;
        boolean b = kcn.b(context);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        oob oobVar2 = (oob) t.b;
        oobVar2.a |= 2;
        oobVar2.c = b;
        int activeCount = Thread.activeCount();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        oob oobVar3 = (oob) t.b;
        oobVar3.a |= 4;
        oobVar3.d = activeCount;
        return (oob) t.cz();
    }

    public static /* synthetic */ String k(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "CANCELED";
            case 3:
                return "INVALID_REQUEST";
            case 4:
                return "HTTP_ERROR";
            case 5:
                return "REQUEST_ERROR";
            case 6:
                return "RESPONSE_OPEN_ERROR";
            case 7:
                return "RESPONSE_CLOSE_ERROR";
            case 8:
                return "NETWORK_IO_ERROR";
            case 9:
                return "DISK_IO_ERROR";
            case 10:
                return "FILE_SYSTEM_ERROR";
            case 11:
                return "UNKNOWN_IO_ERROR";
            default:
                return "null";
        }
    }

    public static oxp l(long j) {
        nfh t = oxp.c.t();
        nfh t2 = oxt.b.t();
        t2.eS(j);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        oxp oxpVar = (oxp) t.b;
        oxt oxtVar = (oxt) t2.cz();
        oxtVar.getClass();
        oxpVar.b = oxtVar;
        oxpVar.a = 3;
        return (oxp) t.cz();
    }

    public static oxp m(Iterable iterable) {
        nfh t = oxp.c.t();
        nfh t2 = oxt.b.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        oxt oxtVar = (oxt) t2.b;
        oxtVar.c();
        ndt.cs(iterable, oxtVar.a);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        oxp oxpVar = (oxp) t.b;
        oxt oxtVar2 = (oxt) t2.cz();
        oxtVar2.getClass();
        oxpVar.b = oxtVar2;
        oxpVar.a = 3;
        return (oxp) t.cz();
    }

    public static oxp n(String str) {
        nfh t = oxp.c.t();
        nfh t2 = oxn.b.t();
        t2.eP(nem.w(lfd.d(str)));
        if (t.c) {
            t.cD();
            t.c = false;
        }
        oxp oxpVar = (oxp) t.b;
        oxn oxnVar = (oxn) t2.cz();
        oxnVar.getClass();
        oxpVar.b = oxnVar;
        oxpVar.a = 1;
        return (oxp) t.cz();
    }

    public static oxp o(Iterable iterable) {
        nfh t = oxn.b.t();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            t.eP(nem.w(lfd.d((String) it.next())));
        }
        nfh t2 = oxp.c.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        oxp oxpVar = (oxp) t2.b;
        oxn oxnVar = (oxn) t.cz();
        oxnVar.getClass();
        oxpVar.b = oxnVar;
        oxpVar.a = 1;
        return (oxp) t2.cz();
    }

    public static final void p(JsonWriter jsonWriter, jsq jsqVar) {
        for (String str : jsqVar.d()) {
            Object a = jsqVar.a(str);
            if (a != null) {
                jsonWriter.name(str).value(a.toString());
            }
        }
    }

    public static mze r(fwe fweVar, String str) {
        nfh t = mze.A.t();
        long r = fweVar.r();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((mze) t.b).a = r;
        long S = fweVar.S();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((mze) t.b).b = S;
        long R = fweVar.R();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((mze) t.b).c = R;
        boolean aD = fweVar.aD();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((mze) t.b).d = aD;
        boolean aB = fweVar.aB();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((mze) t.b).e = aB;
        long A = fweVar.A();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((mze) t.b).f = A;
        boolean aJ = fweVar.aJ();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((mze) t.b).g = aJ;
        boolean am = fweVar.am();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((mze) t.b).h = am;
        long O = fweVar.O();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((mze) t.b).i = O;
        long N = fweVar.N();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((mze) t.b).j = N;
        long u = fweVar.u();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((mze) t.b).k = u;
        float c = fweVar.c();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((mze) t.b).l = c;
        long t2 = fweVar.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((mze) t.b).m = t2;
        float b = fweVar.b();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((mze) t.b).n = b;
        List W = fweVar.W();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mze mzeVar = (mze) t.b;
        nfs nfsVar = mzeVar.o;
        if (!nfsVar.c()) {
            mzeVar.o = nfm.D(nfsVar);
        }
        ndt.cs(W, mzeVar.o);
        boolean aX = fweVar.aX(str);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((mze) t.b).p = aX;
        boolean ai = fweVar.ai();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((mze) t.b).r = ai;
        boolean at = fweVar.at();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((mze) t.b).q = at;
        boolean aq = fweVar.aq();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((mze) t.b).s = aq;
        int n = fweVar.n();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((mze) t.b).t = n;
        boolean ah = fweVar.ah();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((mze) t.b).u = ah;
        boolean ac = fweVar.ac();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((mze) t.b).v = ac;
        boolean aU = fweVar.aU();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((mze) t.b).w = aU;
        boolean ae = fweVar.ae();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((mze) t.b).x = ae;
        int q = fweVar.q();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((mze) t.b).y = q;
        boolean ab = fweVar.ab();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((mze) t.b).z = ab;
        return (mze) t.cz();
    }

    public static String s(String str, String str2) {
        if (str2.trim().isEmpty()) {
            return str;
        }
        return str + "/" + str2;
    }
}
