package defpackage;

import android.util.Base64;

/* compiled from: PG */
/* renamed from: npr  reason: default package */
/* loaded from: classes2.dex */
public final class npr implements npq {
    public static final kju A;
    public static final kju B;
    public static final kju C;
    public static final kju D;
    public static final kju E;
    public static final kju F;
    public static final kju G;
    public static final kju H;
    public static final kju I;
    public static final kju J;
    public static final kju K;
    public static final kju L;
    public static final kju M;
    public static final kju N;
    public static final kju O;
    public static final kju P;
    public static final kju Q;
    public static final kju R;
    public static final kju S;
    public static final kju T;
    public static final kju U;
    public static final kju V;
    public static final kju W;
    public static final kju X;
    public static final kju Y;
    public static final kju Z;
    public static final kju a;
    public static final kju aA;
    public static final kju aB;
    public static final kju aC;
    public static final kju aD;
    public static final kju aE;
    public static final kju aF;
    public static final kju aG;
    public static final kju aH;
    public static final kju aI;
    public static final kju aJ;
    public static final kju aK;
    public static final kju aL;
    public static final kju aM;
    public static final kju aN;
    public static final kju aO;
    public static final kju aP;
    public static final kju aQ;
    public static final kju aR;
    public static final kju aS;
    public static final kju aT;
    public static final kju aU;
    public static final kju aV;
    public static final kju aa;
    public static final kju ab;
    public static final kju ac;
    public static final kju ad;
    public static final kju ae;
    public static final kju af;
    public static final kju ag;
    public static final kju ah;
    public static final kju ai;
    public static final kju aj;
    public static final kju ak;
    public static final kju al;
    public static final kju am;
    public static final kju an;
    public static final kju ao;
    public static final kju ap;
    public static final kju aq;
    public static final kju ar;
    public static final kju as;
    public static final kju at;
    public static final kju au;
    public static final kju av;
    public static final kju aw;
    public static final kju ax;
    public static final kju ay;
    public static final kju az;
    public static final kju b;
    public static final kju c;
    public static final kju d;
    public static final kju e;
    public static final kju f;
    public static final kju g;
    public static final kju h;
    public static final kju i;
    public static final kju j;
    public static final kju k;
    public static final kju l;
    public static final kju m;
    public static final kju n;
    public static final kju o;
    public static final kju p;
    public static final kju q;
    public static final kju r;
    public static final kju s;
    public static final kju t;
    public static final kju u;
    public static final kju v;
    public static final kju w;
    public static final kju x;
    public static final kju y;
    public static final kju z;

    static {
        kjs b2 = new kjs(kjg.a("com.google.android.gms.learning")).c().a().b();
        a = b2.g("TrainerFeature__allow_override_deadline_millis", true);
        b2.g("TrainerFeature__allow_slow_serialized_message_size_computation", true);
        b2.g("TrainerFeature__always_create_side_channels_file", true);
        b = b2.e("TrainerFeature__app_hosted_example_store_chunk_size", 0L);
        b2.g("TrainerFeature__app_hosted_example_store_proxy_use_dynamite_module_init", true);
        c = b2.e("TrainerFeature__app_hosted_example_store_timeout_seconds", 30L);
        b2.g("TrainerFeature__check_battery_before_reporting", true);
        b2.g("TrainerFeature__check_custom_interrupt_flag_before_after_training", true);
        b2.g("TrainerFeature__check_network_before_reporting", true);
        d = b2.g("TrainerFeature__clean_up_leftover_temp_files", true);
        b2.g("TrainerFeature__clear_task_retry_delay_before_run", true);
        e = b2.g("TrainerFeature__client_decoded_http_resources", false);
        b2.g("TrainerFeature__compute_configuration_id_dynamically", true);
        f = b2.e("TrainerFeature__condition_polling_period_millis", 1000L);
        b2.g("TrainerFeature__custom_interruption_flag", true);
        b2.g("TrainerFeature__data_capping_enabled", false);
        g = b2.e("TrainerFeature__default_interval_for_resumption_task_sec", 60L);
        h = b2.g("TrainerFeature__disable_http_request_body_compression", false);
        i = b2.g("TrainerFeature__disable_legacy_pl_training", false);
        j = b2.g("TrainerFeature__droid_guard_enabled", true);
        k = b2.f("TrainerFeature__droid_guard_reduced_configuration_flow_name", "federatedMachineLearningReduced");
        b2.e("TrainerFeature__dynamite_available_disk_space_limit_kilobytes", 0L);
        b2.f("TrainerFeature__dynamite_disk_space_check_package_allowlist", "");
        l = b2.g("TrainerFeature__enable_computation_id", false);
        m = b2.g("TrainerFeature__enable_detailed_example_store_latency_stats", true);
        n = b2.g("TrainerFeature__enable_example_consumption_recording", true);
        o = b2.g("TrainerFeature__enable_grpc_with_eligibility_eval_http_resource_support", false);
        p = b2.g("TrainerFeature__enable_grpc_with_http_resource_support", false);
        q = b2.g("TrainerFeature__enable_in_app_personalization", true);
        b2.g("TrainerFeature__enable_initialization_per_client_execution", true);
        r = b2.g("TrainerFeature__enable_multiple_training_runs", false);
        s = b2.g("TrainerFeature__enable_opstats", true);
        t = b2.g("TrainerFeature__enable_result_handling_callback_for_federated_computation", true);
        u = b2.g("TrainerFeature__enable_resumable_local_computation_tasks", true);
        v = b2.g("TrainerFeature__ensure_dynamic_tensors_are_released", true);
        w = b2.f("TrainerFeature__federated_learning_service_cert_path", "");
        x = b2.f("TrainerFeature__federated_learning_service_uri", "https://federatedml-pa.googleapis.com");
        try {
            y = b2.h("TrainerFeature__federated_training_permanent_error_codes", (njb) nfm.w(njb.b, Base64.decode("CgMDBQw", 3)), npk.c);
            z = b2.d("TrainerFeature__federated_training_permanent_errors_retry_delay_jitter_percent", 0.2d);
            A = b2.e("TrainerFeature__federated_training_permanent_errors_retry_delay_secs", 14400L);
            B = b2.d("TrainerFeature__federated_training_transient_errors_retry_delay_jitter_percent", 0.2d);
            C = b2.e("TrainerFeature__federated_training_transient_errors_retry_delay_secs", 900L);
            D = b2.g("TrainerFeature__fix_trainer_api_learning_context_race", true);
            E = b2.g("TrainerFeature__granular_per_phase_logs", false);
            F = b2.e("TrainerFeature__grpc_channel_deadline_seconds", 600L);
            G = b2.d("TrainerFeature__http2_estimated_header_compression_ratio", 0.5d);
            H = b2.g("TrainerFeature__http_call_disconnect_when_cancelled", true);
            I = b2.e("TrainerFeature__http_connect_timeout_ms", 10000L);
            J = b2.g("TrainerFeature__http_enable_quic", false);
            K = b2.g("TrainerFeature__http_estimate_sent_received_bytes", false);
            L = b2.e("TrainerFeature__http_max_concurrent_requests", 3L);
            M = b2.e("TrainerFeature__http_read_timeout_ms", 60000L);
            N = b2.e("TrainerFeature__http_request_body_chunk_size_bytes", 65536L);
            O = b2.e("TrainerFeature__http_response_body_chunk_size_bytes", 65536L);
            P = b2.e("TrainerFeature__http_response_body_gzip_buffer_size_bytes", 65536L);
            Q = b2.g("TrainerFeature__http_use_cronet", false);
            R = b2.f("TrainerFeature__idle_constraint_scheduling_override_allowlist", "");
            b2.g("TrainerFeature__inapp_training_application_override_check", false);
            S = b2.f("TrainerFeature__inapp_training_blacklist", "");
            b2.e("TrainerFeature__inapp_training_default_pl_scheduling_period_secs", 21600L);
            T = b2.e("TrainerFeature__inapp_training_default_scheduling_period_secs", 300L);
            U = b2.g("TrainerFeature__inapp_training_do_not_require_charging", false);
            V = b2.e("TrainerFeature__inapp_training_failed_run_retry_period_secs", 900L);
            W = b2.e("TrainerFeature__inapp_training_max_scheduling_period_secs", 172800L);
            X = b2.e("TrainerFeature__inapp_training_on_trim_memory_interrupt_level", 10L);
            Y = b2.e("TrainerFeature__inapp_training_override_deadline_ms_for_testing", 0L);
            Z = b2.e("TrainerFeature__inapp_training_service_bind_service_timeout_secs", 10L);
            aa = b2.e("TrainerFeature__inapp_training_service_result_callback_timeout_secs", 585L);
            b2.g("TrainerFeature__is_training_enabled", false);
            ab = b2.g("TrainerFeature__keep_learning_context_open_for_background_training", true);
            ac = b2.e("TrainerFeature__large_tensor_threshold_for_dynamic_allocation", 1000L);
            b2.g("TrainerFeature__log_client_package_name_when_training_is_interrupted", true);
            b2.g("TrainerFeature__log_device_info_on_dynamite_request", false);
            ad = b2.g("TrainerFeature__log_example_store_error_counters", true);
            b2.g("TrainerFeature__log_memory_stats_for_interruptions_and_errors", true);
            ae = b2.g("TrainerFeature__log_process_memory_counters", true);
            af = b2.g("TrainerFeature__log_scheduler_event", true);
            ag = b2.g("TrainerFeature__log_system_memory_counters", true);
            ah = b2.e("TrainerFeature__max_context_data_in_training_api_size_bytes", 8192L);
            b2.e("TrainerFeature__max_error_throttling_period_ms", 0L);
            ai = b2.e("TrainerFeature__max_scheduling_interval_sec_for_local_computation", 518400L);
            aj = b2.e("TrainerFeature__max_user_specified_scheduling_interval_sec_for_federated_computation", 518400L);
            ak = b2.e("TrainerFeature__min_fl_available_space_required_bytes", 10485760L);
            al = b2.e("TrainerFeature__min_pl_available_space_required_bytes", 10485760L);
            am = b2.e("TrainerFeature__min_user_specified_scheduling_interval_sec_for_federated_computation", 60L);
            an = b2.e("TrainerFeature__minimum_scheduling_interval_sec_for_local_compute", 1800L);
            ao = b2.e("TrainerFeature__multiple_training_runs_max_count", 10L);
            b2.g("TrainerFeature__no_check_network_during_training", false);
            ap = b2.e("TrainerFeature__opstats_db_size_limit_bytes", 1048576L);
            aq = b2.e("TrainerFeature__opstats_ttl_days", 30L);
            b2.f("TrainerFeature__participation_conditions_logging_allowlist", "");
            ar = b2.g("TrainerFeature__report_trainer_api_scheduler_runtime_exceptions_to_dropbox", true);
            b2.g("TrainerFeature__request_brella_dynamite_feature", true);
            b2.g("TrainerFeature__request_brella_dynamite_feature_log_result", true);
            b2.g("TrainerFeature__request_brella_dynamite_feature_on_training_start", false);
            b2.g("TrainerFeature__request_brella_dynamite_feature_urgently", false);
            b2.f("TrainerFeature__request_brella_dynamite_feature_with_lower_total_memory_package_allowlist", "");
            b2.g("TrainerFeature__reschedule_after_training", true);
            as = b2.e("TrainerFeature__result_handling_service_bind_service_timeout_secs", 10L);
            at = b2.e("TrainerFeature__result_handling_service_callback_timeout_secs", 585L);
            au = b2.e("TrainerFeature__second_attempt_at_training_task_time_to_live_seconds", 604800L);
            b2.g("TrainerFeature__send_client_version_in_checkin_request", true);
            b2.g("TrainerFeature__should_client_reschedule_training", false);
            av = b2.g("TrainerFeature__should_waive_training_requirements", false);
            b2.e("TrainerFeature__start_training_min_battery_level", 30L);
            aw = b2.g("TrainerFeature__stop_specifying_idle_constraint", true);
            b2.g("TrainerFeature__tf_execution_separate_thread", true);
            ax = b2.e("TrainerFeature__tf_execution_teardown_extended_period_millis", 10000L);
            ay = b2.e("TrainerFeature__tf_execution_teardown_grace_period_millis", 10000L);
            b2.g("TrainerFeature__tf_execution_wedged_terminate_process", true);
            az = b2.f("TrainerFeature__tflite_training_allow_list", "");
            aA = b2.e("TrainerFeature__thermal_status_to_throttle", 2L);
            aB = b2.g("TrainerFeature__thermally_throttle_training", false);
            b2.g("TrainerFeature__trainer_cleanup_after_uninstalled_and_blacklisted_apps", true);
            b2.f("TrainerFeature__trainer_options_consistent_override_deadline_allowlist", "");
            b2.f("TrainerFeature__training_client_blacklist", "com.google.android.as,com.google.android.gms,com.google.android.settings.intelligence,com.android.settings,com.google.android.apps.cerebra.links,com.google.android.apps.accessibility.reveal,com.google.android.apps.nexuslauncher,com.google.android.apps.messaging");
            aC = b2.e("TrainerFeature__training_condition_check_throttle_period_millis", 1000L);
            b2.g("TrainerFeature__training_disabled_reports_success", true);
            aD = b2.e("TrainerFeature__training_min_battery_level", 30L);
            aE = b2.f("TrainerFeature__training_min_battery_level_override_allowlist", "");
            aF = b2.g("TrainerFeature__training_service_use_bind_allow_oom_management_flag", false);
            aG = b2.f("TrainerFeature__training_service_use_bind_allow_oom_management_flag_whitelist", "");
            aH = b2.g("TrainerFeature__training_service_use_bind_not_foreground_flag", false);
            aI = b2.f("TrainerFeature__training_service_use_bind_not_foreground_flag_whitelist", "");
            aJ = b2.g("TrainerFeature__training_service_use_bind_not_perceptible_flag", true);
            aK = b2.f("TrainerFeature__training_service_use_bind_not_perceptible_flag_whitelist", "");
            aL = b2.g("TrainerFeature__training_service_use_bind_waive_priority_flag", false);
            aM = b2.f("TrainerFeature__training_service_use_bind_waive_priority_flag_whitelist", "");
            b2.e("TrainerFeature__training_task_time_to_live_seconds", 0L);
            b2.g("TrainerFeature__ttl_brella_dynamite", true);
            b2.e("TrainerFeature__ttl_brella_dynamite_period_days", 30L);
            aN = b2.g("TrainerFeature__unbind_service_when_connection_failed", true);
            b2.g("TrainerFeature__use_app_hosted_example_store_chunking", true);
            aO = b2.g("TrainerFeature__use_deidentified_logger", false);
            b2.g("TrainerFeature__use_dynamite_in_gmscore_training_second_attempt", true);
            b2.g("TrainerFeature__use_effective_client_package_name", true);
            aP = b2.g("TrainerFeature__use_gmscore_provider_installer_before_training", false);
            aQ = b2.g("TrainerFeature__use_http_federated_compute_protocol", false);
            aR = b2.g("TrainerFeature__use_power_manager_is_interactive_check", true);
            aS = b2.g("TrainerFeature__use_pseudonymous_logger", true);
            aT = b2.g("TrainerFeature__use_truly_random_train_run_id", true);
            aU = b2.e("TrainerFeature__waiting_period_sec_for_cancellation", 10L);
            aV = b2.g("TrainerFeature__waive_network_requirement_for_lc_tasks", true);
            b2.g("TrainerFeature__zero_or_unspecified_batch_size_means_one", true);
        } catch (Exception e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // defpackage.npq
    public final long A() {
        return ((Long) aj.c()).longValue();
    }

    @Override // defpackage.npq
    public final long B() {
        return ((Long) ak.c()).longValue();
    }

    @Override // defpackage.npq
    public final long C() {
        return ((Long) al.c()).longValue();
    }

    @Override // defpackage.npq
    public final long D() {
        return ((Long) am.c()).longValue();
    }

    @Override // defpackage.npq
    public final long E() {
        return ((Long) an.c()).longValue();
    }

    @Override // defpackage.npq
    public final long F() {
        return ((Long) ao.c()).longValue();
    }

    @Override // defpackage.npq
    public final long G() {
        return ((Long) ap.c()).longValue();
    }

    @Override // defpackage.npq
    public final long H() {
        return ((Long) aq.c()).longValue();
    }

    @Override // defpackage.npq
    public final long I() {
        return ((Long) as.c()).longValue();
    }

    @Override // defpackage.npq
    public final long J() {
        return ((Long) at.c()).longValue();
    }

    @Override // defpackage.npq
    public final long K() {
        return ((Long) au.c()).longValue();
    }

    @Override // defpackage.npq
    public final long L() {
        return ((Long) ax.c()).longValue();
    }

    @Override // defpackage.npq
    public final long M() {
        return ((Long) ay.c()).longValue();
    }

    @Override // defpackage.npq
    public final long N() {
        return ((Long) aA.c()).longValue();
    }

    @Override // defpackage.npq
    public final long O() {
        return ((Long) aC.c()).longValue();
    }

    @Override // defpackage.npq
    public final long P() {
        return ((Long) aD.c()).longValue();
    }

    @Override // defpackage.npq
    public final long Q() {
        return ((Long) aU.c()).longValue();
    }

    @Override // defpackage.npq
    public final njb R() {
        return (njb) y.c();
    }

    @Override // defpackage.npq
    public final String S() {
        return (String) k.c();
    }

    @Override // defpackage.npq
    public final String T() {
        return (String) w.c();
    }

    @Override // defpackage.npq
    public final String U() {
        return (String) x.c();
    }

    @Override // defpackage.npq
    public final String V() {
        return (String) R.c();
    }

    @Override // defpackage.npq
    public final String W() {
        return (String) S.c();
    }

    @Override // defpackage.npq
    public final String X() {
        return (String) az.c();
    }

    @Override // defpackage.npq
    public final String Y() {
        return (String) aE.c();
    }

    @Override // defpackage.npq
    public final String Z() {
        return (String) aG.c();
    }

    @Override // defpackage.npq
    public final double a() {
        return ((Double) z.c()).doubleValue();
    }

    @Override // defpackage.npq
    public final boolean aA() {
        return ((Boolean) U.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean aB() {
        return ((Boolean) ab.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean aC() {
        return ((Boolean) ad.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean aD() {
        return ((Boolean) ae.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean aE() {
        return ((Boolean) af.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean aF() {
        return ((Boolean) ag.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean aG() {
        return ((Boolean) ar.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean aH() {
        return ((Boolean) av.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean aI() {
        return ((Boolean) aw.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean aJ() {
        return ((Boolean) aB.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean aK() {
        return ((Boolean) aF.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean aL() {
        return ((Boolean) aH.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean aM() {
        return ((Boolean) aJ.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean aN() {
        return ((Boolean) aL.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean aO() {
        return ((Boolean) aN.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean aP() {
        return ((Boolean) aO.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean aQ() {
        return ((Boolean) aP.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean aR() {
        return ((Boolean) aQ.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean aS() {
        return ((Boolean) aR.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean aT() {
        return ((Boolean) aS.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean aU() {
        return ((Boolean) aT.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean aV() {
        return ((Boolean) aV.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final String aa() {
        return (String) aI.c();
    }

    @Override // defpackage.npq
    public final String ab() {
        return (String) aK.c();
    }

    @Override // defpackage.npq
    public final String ac() {
        return (String) aM.c();
    }

    @Override // defpackage.npq
    public final boolean ad() {
        return ((Boolean) a.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean ae() {
        return ((Boolean) d.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean af() {
        return ((Boolean) e.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean ag() {
        return ((Boolean) h.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean ah() {
        return ((Boolean) i.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean ai() {
        return ((Boolean) j.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean aj() {
        return ((Boolean) l.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean ak() {
        return ((Boolean) m.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean al() {
        return ((Boolean) n.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean am() {
        return ((Boolean) o.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean an() {
        return ((Boolean) p.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean ao() {
        return ((Boolean) q.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean ap() {
        return ((Boolean) r.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean aq() {
        return ((Boolean) s.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean ar() {
        return ((Boolean) t.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean as() {
        return ((Boolean) u.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean at() {
        return ((Boolean) v.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean au() {
        return ((Boolean) D.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean av() {
        return ((Boolean) E.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean aw() {
        return ((Boolean) H.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean ax() {
        return ((Boolean) J.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean ay() {
        return ((Boolean) K.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final boolean az() {
        return ((Boolean) Q.c()).booleanValue();
    }

    @Override // defpackage.npq
    public final double b() {
        return ((Double) B.c()).doubleValue();
    }

    @Override // defpackage.npq
    public final double c() {
        return ((Double) G.c()).doubleValue();
    }

    @Override // defpackage.npq
    public final long d() {
        return ((Long) b.c()).longValue();
    }

    @Override // defpackage.npq
    public final long e() {
        return ((Long) c.c()).longValue();
    }

    @Override // defpackage.npq
    public final long f() {
        return ((Long) f.c()).longValue();
    }

    @Override // defpackage.npq
    public final long g() {
        return ((Long) g.c()).longValue();
    }

    @Override // defpackage.npq
    public final long h() {
        return ((Long) A.c()).longValue();
    }

    @Override // defpackage.npq
    public final long i() {
        return ((Long) C.c()).longValue();
    }

    @Override // defpackage.npq
    public final long j() {
        return ((Long) F.c()).longValue();
    }

    @Override // defpackage.npq
    public final long k() {
        return ((Long) I.c()).longValue();
    }

    @Override // defpackage.npq
    public final long l() {
        return ((Long) L.c()).longValue();
    }

    @Override // defpackage.npq
    public final long m() {
        return ((Long) M.c()).longValue();
    }

    @Override // defpackage.npq
    public final long n() {
        return ((Long) N.c()).longValue();
    }

    @Override // defpackage.npq
    public final long o() {
        return ((Long) O.c()).longValue();
    }

    @Override // defpackage.npq
    public final long p() {
        return ((Long) P.c()).longValue();
    }

    @Override // defpackage.npq
    public final long q() {
        return ((Long) T.c()).longValue();
    }

    @Override // defpackage.npq
    public final long r() {
        return ((Long) V.c()).longValue();
    }

    @Override // defpackage.npq
    public final long s() {
        return ((Long) W.c()).longValue();
    }

    @Override // defpackage.npq
    public final long t() {
        return ((Long) X.c()).longValue();
    }

    @Override // defpackage.npq
    public final long u() {
        return ((Long) Y.c()).longValue();
    }

    @Override // defpackage.npq
    public final long v() {
        return ((Long) Z.c()).longValue();
    }

    @Override // defpackage.npq
    public final long w() {
        return ((Long) aa.c()).longValue();
    }

    @Override // defpackage.npq
    public final long x() {
        return ((Long) ac.c()).longValue();
    }

    @Override // defpackage.npq
    public final long y() {
        return ((Long) ah.c()).longValue();
    }

    @Override // defpackage.npq
    public final long z() {
        return ((Long) ai.c()).longValue();
    }
}
